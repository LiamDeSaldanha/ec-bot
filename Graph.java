import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Vertex {
    public String name; // Vertex name
    public List<Edge> adj; // Adjacent vertices
    public double dist; // Cost
    public Vertex prev; // Previous vertex on shortest path
    public int scratch;// Extra variable used in algorithm

    public Vertex(String nm) {
        name = nm;
        adj = new LinkedList<Edge>();
        reset();
    }

    public void reset()
    // { dist = Graph.INFINITY; prev = null; pos = null; scratch = 0; }
    {
        dist = Graph.INFINITY;
        prev = null;
        scratch = 0;
    }
}

    class Path implements Comparable<Path> {
        public Vertex dest; // w
        public double cost; // d(w)
    
        public Path(Vertex d, double c) {
            dest = d;
            cost = c;
        }
    
        public int compareTo(Path rhs) {
            double otherCost = rhs.cost;
    
            return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
        }
    
        public String toString() {
            return cost + " ";
        }
    }

    class Edge {
        public Vertex dest; // Second vertex in Edge
        public double cost; // Edge cost
    
        public Edge(Vertex d, double c) {
            dest = d;
            cost = c;
        }
    }

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;
    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();
    public int x, y;

    public Vertex getVertex(String vertexName) {
        Vertex v = vertexMap.get(vertexName);
        if (v == null) {
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }

    public void addEdge(String sourceName, String destName, double cost) {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
        //edgeList.add(sourceName + " " + destName);

    }






}

