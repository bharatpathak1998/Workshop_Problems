package linked_list_own;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(0);

        System.out.println("Print the elements : ");
        linkedList.print();


        System.out.println("Delete first element : ");
        linkedList.deleteFirst(); //delete first node
        linkedList.print();


        System.out.println("Delete last element : ");
        linkedList.deleteLast(); //delete last node
        linkedList.print();
    }
}