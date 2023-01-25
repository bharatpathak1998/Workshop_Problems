import java.util.ArrayList;
import java.util.List;

public class ConvertChinese {

    public void print(String name, List<Character> list1) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            for (int j = 1; j < list1.size(); j++) {
                if (ch == list1.get(j)) {
                    System.out.print(ch + " -> " + j + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        String name = "SANSKRUTI";
        List<Character> list1 = new ArrayList<>(List.of('-', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U'));
        ConvertChinese convertChinese = new ConvertChinese();
        convertChinese.print(name, list1);
    }
}
