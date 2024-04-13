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

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;
    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();
    public String path = "";
    public ArrayList<String> pathList = new ArrayList<>();
    public ArrayList<Double> priceList = new ArrayList<>();
    public ArrayList<String> edgeList = new ArrayList<>();
    public int counter = 0;
    public int pathCounter = 0;
    public boolean multiplePaths = false;
    public boolean breakOut = false;
    public ArrayList<String> multPaths = new ArrayList<>();


        /**
     * Add a new edge to the graph.
     */
    public void addEdge(String sourceName, String destName, double cost) {
        Vertex v = vertex.getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
        edgeList.add(sourceName + " " + destName);

    }
}

