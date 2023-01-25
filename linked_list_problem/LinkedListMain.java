package linked_list_problem;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(list, 1);
        list.addNode(list, 2);
        list.addNode(list, 3);
        list.addNode(list, 4);
        list.addNode(list, 5);
        list.addNode(list, 6);

        list.printList(list);
    }
}
