import java.util.Scanner;

public class NameCharCount {

    int countChar(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Name : ");
        String name = sc.nextLine();

        NameCharCount nameCharCount = new NameCharCount();
        System.out.println("Number Of Characters : " + nameCharCount.countChar(name));
    }
}
