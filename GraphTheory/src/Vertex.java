import java.util.LinkedList;
import java.util.List;

/**
 * Created by qinusty on 16/02/16.
 */
public class Vertex {
    // Instance Variables
    private String name;
    private LinkedList<Edge> edges;
    private Tree tree;

    /**
     * Constructor for the Vertex Class, creates a new object of type Vertex.
     * @param name
     *      The string to represent the Vertex.
     */
    public Vertex(String name) {
        this.name = name;
        this.edges = new LinkedList<Edge>();
    }

    public String getName() {
        return name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * Gets the tree that the vertex is part of.
     * @return
     *      Returns a tree object which the vertex is part of.
     */
    public Tree getTree() {
        return tree;
    }

    /**
     * Sets the tree that the vertex is part of.
     * @param tree
     *     Changes the value which represents which tree the Vertex is part of.
     */
    public void setTree(Tree tree) {
        this.tree = tree;
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
