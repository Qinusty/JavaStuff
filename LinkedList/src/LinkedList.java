/**
 * Created by qinusty on 08/02/16.
 */
public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(new Node(data));
        }
    }

    public boolean contains(int search) {
        Node curNode = head;
        while (curNode != null && curNode.getData() != search) {
            curNode = curNode.getNext();
        }
        if (curNode.getData() == search) {
            return true;
        } else  {
            return false;
        }
    }

    public void printList() {
        Node curNode = head;
        while (curNode != null)
        {
            System.out.println(curNode.getData());
            curNode = curNode.getNext();
        }
    }
}
