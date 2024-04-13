import java.util.ArrayList;

public class Node {

     private int x, y;
     private String nodeNum;
     private Herb herb;
     private double waterCoverage;
     private double sunCoverage;
     private String type;

     public String[] edges = new String[10000];

     public Node(String nodeNum, int x, int y, Herb herb) {
          this.nodeNum = nodeNum;
          this.x = x;
          this.y = y;
          this.herb = herb;
          this.covered = 0;
          type = "Empty";
     }

     public void setHerb(String herbName) {
          this.herb = herbName;

     }

     public void setEdges(String[] edges) {
          this.edges = edges;
     }

     public void setWaterCoverage(double water) {
          this.waterCoverage = water;
     }

     public void setSunCoverage(double water) {
          this.sunCoverage = water;
     }

     public String getName() {
          return nodeNum;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public void getHerb() {
          return herb;
     }

     public int getX() {
          return x;
     }

     public int getY() {
          return y;
     }
}
