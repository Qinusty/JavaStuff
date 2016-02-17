import java.util.ArrayList;

/**
 * Created by qinusty on 16/02/16.
 */
public class Tree {
    // Instance Variables
    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Tree(Vertex v) {
        this.vertices = new ArrayList<Vertex>();
        this.edges = new ArrayList<Edge>();
        vertices.add(v);
    }

    /**
     * Adds a vertex to the tree.
     * @param v
     *      The vertex to be added.
     */
    public void connectVertex(Vertex v, Edge e) {
        vertices.add(v);
        edges.add(e);
    }

    /**
     * Adds an edge to the tree. Also adds any vertices which are
     * connected to the edge but not part of the tree.
     * @param e
     *      The edge to be added.
     */
    public void addEdge(Edge e) {
        edges.add(e);
        for (Vertex v : e.getVertices()) {
            if (!vertices.contains(v)) {
                vertices.add(v);
            }
        }
    }

    /**
     * Adds a tree on to this tree connecting it via an edge.
     * @param t
     *      The tree to combine with this tree.
     * @param e
     *      The Edge which is connecting the two trees.
     */
    public void combine(Tree t, Edge e) {
        this.vertices.addAll(t.getVertices());
        this.edges.addAll(t.getEdges());
        this.edges.add(e);
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    /**
     * Formulates a multiline string to represent the Tree e.g.
     *
     * A->B : 10
     * B->C : 5
     * Has a total weight of 15.
     *
     * where 10 and 5 are weights of their respective Edges.
     * @return
     *      A string to visualise the current state of the Tree.
     */
    public String toString() {
        int totalWeight = 0;
        String retStr = "";
        for (Edge e : edges) {
            retStr += e.toString() + "\n";
            totalWeight += e.getWeight();
        }
        return retStr + "Has a total weight of " + totalWeight + ".";
    }
}
