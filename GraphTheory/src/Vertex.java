import java.util.LinkedList;
import java.util.List;

/**
 * Created by qinusty on 16/02/16.
 */
public class Vertex {
    // Instance Variables
    private char ID;
    private LinkedList<Edge> edges;

    /**
     * Constructor for the Vertex Class, creates a new object of type Vertex.
     * @param ID
     *      The string to represent the Vertex.
     */
    public Vertex(char ID) {
        this.ID = ID;
        this.edges = new LinkedList<Edge>();
    }

    public char getID() {
        return ID;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * Adds a single edge to the list of Edges connected to this Vertex.
     * @param e
     *      The edge to add.
     */
    public void addEdge(Edge e) {
        edges.add(e);
    }
}
