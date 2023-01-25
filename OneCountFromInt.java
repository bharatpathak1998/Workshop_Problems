import java.util.ArrayList;
import java.util.Arrays;

public class OneCountFromInt {
    int oneCount(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char[] ch = Integer.toString(list.get(i)).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1111, 1011, 1001, 1000));

        OneCountFromInt oneCountFromInt = new OneCountFromInt();
        System.out.println("One Count : " + oneCountFromInt.oneCount(list));
    }
}
