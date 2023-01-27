package stack_own;

public class Stack {
    Node top;

    // Here we are push given data into the stack :-
    public void push(int key) {
        Node newNode = new Node(key);

        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    // Here we are pop top element from the stack :-
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        top = top.next;
    }

    // Here we are retrieve top element from the stack :-
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            System.exit(0);
        }
        return top.key;
    }

    // Here we create print method to print the stack :-
    public void print() {
        Node current = top;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
    }
}