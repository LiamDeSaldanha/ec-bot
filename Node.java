import java.util.ArrayList;

public class Node {

     private int x, y;
     private String nodeNum;
     private String herb;
     private boolean covered;
     public String[] edges = new String[10000];

     public Node(String nodeNum, int x, int y, String herb) {
          this.nodeNum = nodeNum;
          this.x = x;
          this.y = y;
          this.herb = herb;
     }

     public void setHerb(String herbName) {
          this.herb = herbName;

     }

     public void setEdges(String[] edges) {
          this.edges = edges;
     }

}
