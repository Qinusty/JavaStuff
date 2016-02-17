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

    /**
     * Adds a vertex to the list of vertices.
     * @param v
     *      The vertex to be added.
     */
    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    /**
     * Connects two Vertices via an edge which is created based on the weight provided.
     * @param a
     *      The starting vertex.
     * @param b
     *      The destination vertex.
     * @param weight
     *      The weight to be given to the edge connecting the two vertices.
     */
    public void connectVertices(Vertex a, Vertex b, int weight) {
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

    /**
     * Takes a file path and returns a graph if the file was a valid graph definition.
     * A Valid file is a .csv file with the format
     *
     * A,B,10
     * A,C,4
     * B,D,6
     *
     * Which  represents a table as follows:
     *
     * | Vertex | Vertex | Weight |
     * |--------|--------|--------|
     * |    A   |   B    |   10   |
     * |    A   |   C    |    4   |
     * |    B   |   D    |    6   |
     *
     * @param path
     *      File path to try and interpret
     * @return
     *      A graph based on the files contents.
     */
    public static Graph graphFromFile(Path path) {
        Graph g = new Graph();
        // import from a txt file etc...
        // A-D 10 // would be Vertex A, Vertex D, connected by an edge of weight 10
        return g;
    }


}
