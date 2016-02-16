import java.util.ArrayList;

/**
 * Created by qinusty on 16/02/16.
 */
public class Tree {
    // Instance Variables
    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Tree(Vertex v) {
        v.setTree(this);
    }

    public void combine(Tree t) {
        this.vertices.addAll(t.getVertices());
        this.edges.addAll(t.getEdges());
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}
