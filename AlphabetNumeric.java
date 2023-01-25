import java.util.Scanner;

public class AlphabetNumeric {

    void print(String name) {
        for (int j = 0; j < name.length(); j++) {
            int count = 1;
            char ch = name.charAt(j);
            for (char i = 'a'; i <= 'z'; i++) {
                if (ch == i) {
                    System.out.println(ch + " -> " + count);
                }
                count++;
            }
        }
    }

    public static void main(String[] args) {
        AlphabetNumeric alphabetNumeric = new AlphabetNumeric();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name to locate numeric position of alphabets : ");
        String name = sc.next().toLowerCase();
        alphabetNumeric.print(name);
    }
}
