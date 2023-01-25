import java.util.ArrayList;
import java.util.List;

public class ArrayListStrConvertChar {
    void print(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            char[] ch = list.get(i).toLowerCase().toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    ch[j] = '0';
                } else {
                    ch[j] = '1';
                }
                list.set(i, String.valueOf(ch));
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("1100", "0001", "0000", "1111"));

        ArrayListStrConvertChar arrayListStrConvertChar = new ArrayListStrConvertChar();
        arrayListStrConvertChar.print(list);
    }
}
