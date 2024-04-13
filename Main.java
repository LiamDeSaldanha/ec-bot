
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

        while (input.nextLine().charAt(0) != '}'){
            String line = input.nextLine();
            node = line.charAt(3) + "";
            x  = Integer.parseInt(line.substring(line.indexOf("["), line.indexOf(",")));
            y = Integer.parseInt(line.substring(line.indexOf(","), line.indexOf("[")));
            
            gardens[counter] = new Node(node, x, y, null);
            counter++;
        }

        input.nextLine();

        for (int i = 0; i < counter; i++) {
            String line = input.nextLine();
            String paths = (line.substring(line.indexOf("["), line.indexOf("]")));
            edges = paths.split(", ");
            gardens[i].setEdges(edges);
        }


        //READ OUTPUTS TO TEXT FILE
        String fileName = "output.txt"; // Specify the file name

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write content to the file
            writer.write("Hello, world!\n");
            

            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }


    }
}
