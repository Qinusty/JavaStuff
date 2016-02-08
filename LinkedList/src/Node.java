/**
 * Created by qinusty on 08/02/16.
 */
public class Node {

    private int data;
    private Node next;

    public Node(int i) {
        data = i;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node n) {
        next = n;
    }
    public int getData() {
        return data;
    }
    public void setData(int d) {
        data = d;
    }
}
