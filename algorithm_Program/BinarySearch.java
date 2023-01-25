package algorithm_Program;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public void binarySearch(String[] str) {
        Arrays.sort(str);

        System.out.println("Sorted Array : ");
        for (String word : str) {
            System.out.println(word);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name To check Index Of Word From Array : ");
        int index = Arrays.binarySearch(str, sc.nextLine());
        if (index < 0 || index > str.length) {
            System.out.println("Please Enter Word From Array!");
        } else {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        String[] str = {"Apple", "Pineapple", "Banana", "Orange"};

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(str);
    }
}
