import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Example 1 : Primms");
        Primms(ExampleGraphs.Example1());
        System.out.println("Example 2 : Primms");
        Primms(ExampleGraphs.Example2());
    }

    public static void Primms(Graph g) {
        // Create a tree, picking the first Vertex in the list of Verices available for the graph.
        int vertexCount = 0;
        int vertexTotal;
            // Create a NEW arraylist identical to the one stored in Graphs.
        LinkedList<Vertex> vertices = new LinkedList<Vertex>( g.getVertices() );
        Vertex startingPoint = vertices.getFirst();
        Tree workingTree = new Tree(startingPoint);
            // get the size of the list before removing any vertices to use as reference
        vertexTotal = vertices.size();
        vertexCount += 1;

        do {
            ArrayList<Edge> edges = new ArrayList<Edge>();
                // Gather all of the edges in the tree.
            for (Vertex v : workingTree.getVertices()) {
                for (Edge e : v.getEdges()) {
                    // if the edge connects to an unknown vertex, add it to our list of
                    // considered edges.
                    if (!workingTree.getVertices().containsAll(e.getVertices())) {
                        edges.add(e);
                    }
                }
            }
            Edge smallestWeightEdge = edges.get(0);
            // Find the edge with the smallest Weight
            for (Edge e : edges) {
                if (e.getWeight() < smallestWeightEdge.getWeight()) {
                    smallestWeightEdge = e;
                }
            }

            workingTree.addEdge(smallestWeightEdge); // also adds the vertex
            vertexCount ++;
        }while(vertexCount != vertexTotal);

        System.out.println(workingTree.toString());
    }

    public static void Kruskalls() {

    }
}
