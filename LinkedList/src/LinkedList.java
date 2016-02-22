/**
 * Created by qinusty on 08/02/16.
 */
public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }


    /**
     * Adds a node to the current data structure
     * @param data integer to be added
     */
    public void addNode(Comparable data) {
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

    public boolean contains(Comparable search) {
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



    /**
     * Created by qinusty on 08/02/16.
     * Edited by SirSharpest on 22/02/16
     */
    private class Node implements Comparable<Node>{

        private Comparable data;
        private Node next;

        public Node(Comparable i) {
            data = i;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node n) {
            next = n;
        }
        public Comparable getData() {
            return data;
        }
        public void setData(Comparable d) {
            data = d;
        }

        /**
         * Returns 0 if equal
         * positive if greater than
         * negative if less than
         * @param o node to check against
         * @return evaluation of node
         * @Override
         */
        public int compareTo(Node o) {
            return this.data.compareTo(o.data);
        }
    }



}
