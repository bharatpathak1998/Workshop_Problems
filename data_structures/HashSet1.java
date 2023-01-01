package data_structures;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Bharat");
        set.add("Mohit");
        set.add("Yash");
        set.add("Aniket");
        set.add("Bharat");
        System.out.println(set);

        set.remove("Yash");
        System.out.println(set);
    }
}
