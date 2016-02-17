import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Example 1 : Primms");
//        Primms(ExampleGraphs.Example1());
//        System.out.println("Example 2 : Primms");
//        Primms(ExampleGraphs.Example2());
//        System.out.println("Example 1 : Kruskals");
//        Kruskals(ExampleGraphs.Example1());
//        System.out.println("Example 2 : Kruskals");
//        Kruskals(ExampleGraphs.Example2());
    }

    public static void Primms(Graph g) {
        // Create a tree, picking the first Vertex in the list of Verices available for the graph.
        int vertexCount = 0;
        int vertexTotal;
        // Create a NEW arraylist identical to the one stored in Graphs.
        LinkedList<Vertex> vertices = new LinkedList<Vertex>(g.getVertices());
        Vertex startingPoint = vertices.getFirst();
        Tree workingTree = new Tree(startingPoint);
        // get the size of the list before removing any vertices to use as reference
        vertexTotal = vertices.size();
        vertexCount += 1;

        do {
            ArrayList<Edge> edges = new ArrayList<>();
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
            vertexCount++;
        } while (vertexCount != vertexTotal);

        System.out.println(workingTree.toString());
    }

    public static void Kruskals(Graph g) {
        // Create new lists of all of the vertices and edges in the graph.
        ArrayList<Vertex> vertices = new ArrayList<Vertex>(g.getVertices());
        ArrayList<Tree> f = new ArrayList<Tree>();
        ArrayList<Edge> edges = new ArrayList<Edge>(g.getEdges());
        // sort the edges into increasing order based on their weight
        Collections.sort(edges);
        // Create a new Tree in the forest for each vertex. Each tree should contain 1 vertex to start.
        for (Vertex v : vertices) {
            f.add(new Tree(v));
        }
        // Loop through the edges
        for (Edge e : edges) {
            Tree a = null, b = null;
            // Find the tree's that each of the vertices at either end of edge e belong to.
            for (Tree t : f) {
                if (t.getVertices().contains(e.getVertices().get(0))) {
                    a = t;
                }
                if (t.getVertices().contains(e.getVertices().get(1))) {
                    b = t;
                }
                // once a and b have been discovered, break out of the loop.
                if (a != null && b != null) {
                    break;
                }
            }
            // If the two vertices belong to different trees e.g. tree a and b aren't the same tree.
            // combine b with a and then remove b from the forest.
            if (a != b) {
                a.combine(b, e);
                f.remove(b);
            }
            // Once we only have one tree in the forest, break the loop.
            if (f.size() == 1) {
                break;
            }
        }
        System.out.println(f.get(0).toString());

    }
}
