import java.util.Scanner;

public class StringArrayCountChar {
    void countChar(String[] str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].toLowerCase().charAt(j) == ch || str[i].toUpperCase().charAt(j) == ch) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println(ch + " is not available in the String array");
        } else {
            System.out.println("Number Of Character : " + count);
        }
    }

    public static void main(String[] args) {
        String[] str = {"Bharat", "Yash", "Aniket", "Mohit", "Sharad", "Rohit"};

        StringArrayCountChar stringArrayCountChar = new StringArrayCountChar();
        stringArrayCountChar.countChar(str);
    }
}