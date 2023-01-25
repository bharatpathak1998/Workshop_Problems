import java.util.ArrayList;

public class SeparateWithCountA {

    public void print(String str) {

        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (chars != ' ') {
                list.add(chars);
            }
            if (chars == 'a' || chars == 'A') {
                count++;
            }
        }
        System.out.println("'a' Count : " + count);
        System.out.println(list);
    }

    public static void main(String[] args) {

        String name = "Bharat Yash Sans Aniket";

        SeparateWithCountA separate = new SeparateWithCountA();
        separate.print(name);
    }
}