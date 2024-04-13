import org.json.simple.JSONObject;
import java.io.FileWriter;

public class jsonWriter {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name", "John");
        // Continue with other fields

        try (FileWriter file = new FileWriter("path_to_your_json_file.json")) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
