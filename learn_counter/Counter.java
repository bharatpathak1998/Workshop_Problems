package learn_counter;

import java.util.Scanner;

public class Counter {

    int print(String[] str, Scanner sc) {
        System.out.println("Enter any character to count : ");
        char chars = sc.next().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            String ch = str[i];
            for (int j = 0; j < ch.length(); j++) {
                if (ch.charAt(j) == chars) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = {"Yash", "Bharat", "Aniket"};

        Counter counter = new Counter();

        int intCount = counter.print(str, sc);

        if (intCount == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println(intCount);

        }
    }
}
