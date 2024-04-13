import java.util.ArrayList;

public class Node {

     public int x, y;
     public String nodeNum;
     public String herb;
     public boolean covered;
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
