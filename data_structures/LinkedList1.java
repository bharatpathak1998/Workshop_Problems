package data_structures;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("India");
        linkedList.add("USA");
        linkedList.add("UK");
        linkedList.add("Canada");
        System.out.println(linkedList);



        linkedList.remove("USA");
        System.out.println(linkedList);



        linkedList.add(2, "Bangladesh");
        System.out.println(linkedList);



        linkedList.addLast("Japan");
        System.out.println(linkedList);


//        linkedList.removeFirst();
//        linkedList.remove(3);


        linkedList.addFirst("Russia");
        System.out.println(linkedList);



        linkedList.set(0,"Australia");
        System.out.println(linkedList);
    }
}
