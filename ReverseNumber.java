import java.util.Scanner;

public class ReverseNumber {
    public void print(Scanner sc) {
        for (int i = sc.nextInt(); i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        reverseNumber.print(sc);
    }
}