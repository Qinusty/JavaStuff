/**
 * Created by qinusty on 16/02/16.
 */
public class ExampleGraphs {
    public static Graph Example1() {
        Graph graph = new Graph();
        Vertex a = new Vertex('A');
        Vertex b = new Vertex('B');
        Vertex c = new Vertex('C');
        Vertex d = new Vertex('D');
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);

        graph.connectVertices(a, b, 2);
        graph.connectVertices(a, d, 1);
        graph.connectVertices(b, d, 2);
        graph.connectVertices(c, d, 3);
        return graph;
    }

    public static Graph Example2() {
        Graph graph = new Graph();
        Vertex a = new Vertex('A');
        Vertex b = new Vertex('B');
        Vertex c = new Vertex('C');
        Vertex d = new Vertex('D');
        Vertex e = new Vertex('E');
        Vertex f = new Vertex('F');
        Vertex g = new Vertex('G');

        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);

        graph.connectVertices(a, b, 4);
        graph.connectVertices(a, c, 8);
        graph.connectVertices(b, c, 9);
        graph.connectVertices(b, d, 8);
        graph.connectVertices(b, e, 10);
        graph.connectVertices(c, d, 2);
        graph.connectVertices(c, f, 1);
        graph.connectVertices(d, e, 7);
        graph.connectVertices(d, f, 9);
        graph.connectVertices(e, f, 5);
        graph.connectVertices(e, g, 6);
        graph.connectVertices(f, g, 2);
        return graph;
    }
}
