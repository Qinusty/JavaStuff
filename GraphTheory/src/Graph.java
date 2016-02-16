import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by qinusty on 16/02/16.
 */
public class Graph {
    // Instance variables
    private LinkedList<Vertex> vertices;
    private LinkedList<Edge> edges;
    private ArrayList<Tree> trees;

    public Graph() {
        this.vertices = new LinkedList<Vertex>();
        this.edges = new LinkedList<Edge>();
        this.trees = new ArrayList<Tree>();
    }

    public void addNode(Vertex v) {
        vertices.add(v);
    }

    public void connectNodes(Vertex a, Vertex b, int weight) {
        edges.add(new Edge(a, b, weight));
    }

    public LinkedList<Vertex> getVertices() {
        return vertices;
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    //******************** Static Methods ****************//
    public static Graph graphFromFile(Path path) {
        Graph g = new Graph();
        // import from a txt file etc...
        // A-D 10 // would be Vertex A, Vertex D, connected by an edge of weight 10
        return g;
    }


}
