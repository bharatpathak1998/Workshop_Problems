import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputCharCountSearch {

    int print(ArrayList<String> list, char chars) {
        int count = 0;

//        for (String str : list) {
//            if (str.toLowerCase().contains(String.valueOf(chars))) {
//                System.out.println(str);
//                count++;
//            }
//        }
        for (String str : list) {
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == chars) {
                    System.out.println(str);
                    count++;
                }
            }
        }
//  -------------------------------------------------------------------------------------
//        for (String str : list) {
//            if (str.toLowerCase().contains(String.valueOf(chars).toLowerCase())) {
//                System.out.println(str);
//            }
//            char[] ch = str.toLowerCase().toCharArray();
//            for (int j = 0; j < ch.length; j++) {
//                if (chars == ch[j]) {
//                    count++;
//                }
//            }
//        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Bharat", "Yash", "Aniket", "Kick"));

        System.out.println("Enter any character to search in name : ");
        char chars = sc.next().toLowerCase().charAt(0);

        InputCharCountSearch charCountSearch = new InputCharCountSearch();
        int intCount = charCountSearch.print(list, chars);

        if (intCount == 0) {
            System.out.println("Match not found!");
        } else {
            System.out.println("\nCount Character (" + chars + ") : " + intCount);
        }
    }
}