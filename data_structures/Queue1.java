package data_structures;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        //FIFO:- First Add and First Remove
        Deque<String> queue = new LinkedList<>();

        queue.add("Bharat");
        queue.add("Mohit");
        queue.add("Yash");
        queue.add("Aniket");
        System.out.println(queue);


        queue.remove();
        queue.add("akshay");
        System.out.println(queue);


        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
    }
}
