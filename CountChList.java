import java.util.ArrayList;
import java.util.Arrays;

public class CountChList {

    int print(ArrayList<String> list, char[] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                char[] chars = list.get(j).toLowerCase().toCharArray();
                for (int k = 0; k < chars.length; k++) {
                    if (ch[i] == chars[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Aniket", "Bharat", "Yash"));
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        CountChList countChList = new CountChList();
        int intCount = countChList.print(list, ch);

        if (intCount == 0) {
            System.out.println("No Match Found!");
        } else {
            System.out.println("Vowels Count : " + intCount);
        }
    }
}