/**
 * Created by qinusty on 16/02/16.
 */
public class Edge {
    // Instance Variables
    private Vertex[] vertices;
    private int weight;

    /**
     * Constructor for Edge class. Instantiates a new Edge object.
     * @param start
     *      The node to begin the edge from.
     * @param end
     *      The node to end the edge at.
     * @param w
     *      Weight of the edge.
     */
    public Edge(Vertex start, Vertex end, int w) {
        this.vertices = new Vertex[] {start, end};
        this.weight = w;
        start.addEdge(this);
        end.addEdge(this);
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public int getWeight() {
        return weight;
    }
}
