package stack_own;

public class MyStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(9); // 9 is added in the last(last in)

        System.out.println("Print the elements : ");
        stack.print();


        System.out.println("\nPop the element : ");
        stack.pop(); // 9 is deleted first(first out)
        stack.print();


        System.out.println("\nPeek the element : ");
        System.out.println(stack.peek());
    }
}
