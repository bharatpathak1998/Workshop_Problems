import java.util.Scanner;

public class Palindrome {
    void print(int num) {
        int rem, temp, rev = 0;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        if (rev == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        palindrome.print(num);
    }
}