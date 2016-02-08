/**
 * Created by qinusty on 08/02/16.
 */
public class main {

    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(12);
        list.addNode(3);

        System.out.println(list.contains(12));
        list.printList();
    }

}
