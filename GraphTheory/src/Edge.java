import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by qinusty on 16/02/16.
 */
public class Edge implements Comparable<Edge> {
    // Instance Variables
    private ArrayList<Vertex> vertices;
    private int weight;

    /**
     * Constructor for Edge class. Instantiates a new Edge object.
     *
     * @param start The node to begin the edge from.
     * @param end   The node to end the edge at.
     * @param w     Weight of the edge.
     */
    public Edge(Vertex start, Vertex end, int w) {
        this.vertices = new ArrayList<Vertex>();
        this.vertices.add(start);
        this.vertices.add(end);
        this.weight = w;
        start.addEdge(this);
        end.addEdge(this);
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * Compares the weight of this edge against anothers.
     * @param e
     *      The edge to compare against.
     * @return
     *      A usual comparable return value, -1 for this is less than, 0 for this is equal to and 1 for this is greater than.
     */
    public int compareTo(Edge e) {
        if (this.weight < e.weight) {
            return -1;
        } else if (this.weight > e.weight) {
            return 1;
        } else return 0;
    }

    public String toString() {
        return vertices.get(0).getID() + "->" + vertices.get(1).getID() + " : " + weight;
    }


}
