package linked_list_own_string;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("Bharat");
        linkedList.add("Yash");
        linkedList.add("Sonal");
        linkedList.add("Mohit");
        linkedList.add("Pranav");

        System.out.println("Print The Node : ");
        linkedList.print();

        System.out.println("Delete First Node : ");
        linkedList.deleteFirst(); //delete first node
        linkedList.print();

        System.out.println("Delete Last Node : ");
        linkedList.deleteLast(); //delete last node
        linkedList.print();
    }
}