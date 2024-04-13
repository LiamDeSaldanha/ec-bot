
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        //READING IN THE TEXT FILE
        Scanner input = new Scanner(new File("1.txt"));
        Node[] gardens = new Node[1000];
        String[] edges = new String[10000];

        int x, y;
        String node;
        int counter = 0;

        input.nextLine();
        while (input.hasNextLine()){

            String line = input.nextLine();
            if( line.charAt(0) == '}'){
                break;
            }
            
            node = line.charAt(3) + "";
            if(line.charAt(4) != '"'){
                node+= line.charAt(4);
            }
            x  = Integer.parseInt(line.substring(line.indexOf("[") + 1, line.indexOf(",")));   
            y = Integer.parseInt(line.substring(line.indexOf(",") + 2, line.indexOf("]")));
            
            
            
            gardens[counter] = new Node(node, x, y, "HERB");
            counter++;
        }

        input.nextLine();

        for (int i = 0; i < counter; i++) {
            String line2 = input.nextLine();
            String paths = (line2.substring(line2.indexOf("[") + 1, line2.indexOf("]") ));
            edges = paths.split(", ");
            gardens[i].setEdges(edges);
            
        }
        //////


        //READ OUTPUTS TO TEXT FILE
        String fileName = "output.txt"; // Specify the file name

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write content to the file
            writer.write("{\n");
            writer.write("\"Herbs:\" [\n");

            for (int i = 0; i < counter; i++) {
                writer.write("[" + gardens[i].nodeNum +  ", \"" + gardens[i].getHerb() + "\" ],\n");
                
            }

            writer.write("\"Sprinklers:\" [");

            writer.write("\n}");
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }


    }
}
