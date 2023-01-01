package data_structures;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        //LIFO:- Last Add And First Remove
        Stack<String> stack = new Stack<>();

        stack.push("Bharat");
        stack.push("Yash");
        stack.push("Aniket");
        stack.push("Mohit");
        stack.add("Parth");
        stack.add(0, "Amol");
        System.out.println(stack);


        stack.set(0, "Lucky");
        System.out.println(stack);


        System.out.println(stack.peek());


        stack.pop();
        System.out.println(stack);
    }
}
