import java.util.Scanner;

public class ReverseString {

    void reverseName(String str) {
        System.out.print("Reverse of a String '" + str + "' is : ");
        for (int i = str.length(); i > 0; i--) {
            System.out.print(str.charAt(i - 1));
        }
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();

        ReverseString reverseString = new ReverseString();
        reverseString.reverseName(str);
    }
}
