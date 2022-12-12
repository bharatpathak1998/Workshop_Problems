import java.util.Scanner;

public class CountChar {

    int countChar(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.print(ch + " ");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Name : ");
        String name = sc.nextLine();

        CountChar countChar = new CountChar();
        System.out.println("\nNumber Of Character : " + countChar.countChar(name));

    }
}
