import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceChar {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1111", "1110", "1100", "1000", "0000", "0101", "0001", "0011", "0111", "1010"));

        ReplaceChar replaceChar = new ReplaceChar();
        replaceChar.print(list);
    }
    void print(ArrayList<String> list) {
        int count = 0;
        for (String str : list) {
            char[] ch = str.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    ch[j] = '0';
                } else {
                    ch[j] = '1';
                }
                list.set(count, String.valueOf(ch));
            }
            count++;
        }
        System.out.println(list);
    }
}
