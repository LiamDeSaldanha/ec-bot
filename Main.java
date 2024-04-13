<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Graph g = new Graph();
        Node pos;
        Scanner input = new Scanner(new File("1.txt"));
        Node[] gardens = new Node[100];

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

        while (int)
    }

=======
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("test.json"));
            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            // Continue with other fields
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
>>>>>>> 29e7950e5b82659d44a3b8a26b88be8225f81b9a
}
