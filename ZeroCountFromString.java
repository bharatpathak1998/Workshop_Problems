import java.util.ArrayList;
import java.util.Arrays;

public class ZeroCountFromString {
    int zeroCount(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char[] ch = list.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '0') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1111", "11000", "1100", "10000", "0011"));

        ZeroCountFromString zeroCount = new ZeroCountFromString();
        System.out.println("Count Zero : " + zeroCount.zeroCount(list));
    }
}