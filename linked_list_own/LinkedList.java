package linked_list_own;


public class LinkedList {
    Node head;

    // Here we are create add method to add node :-
    public void add(int key) {
        Node newNode = new Node(key);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Here we are create a deleteFirst method to delete first node :-
    public void deleteFirst() {
        Node temp = head;

        if (temp != null) {
            head = temp.next;
        }
    }

    // Here we are create a deleteLast method to delete last node :-
    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Here we create print method to print the node :-
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.key);
            current = current.next;
        }
        System.out.println();
    }
}