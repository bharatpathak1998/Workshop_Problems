import java.util.HashSet;
import java.util.Set;

public class CommonNameStringArray {

    void commonString(String[] str1, String[] str2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].equals(str2[j])) {
                    set.add(str1[i]);
                }
            }
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        String[] str1 = {"C", "C++", "C#", "JAVA", "SQL", "ORACLE", "Android"};
        String[] str2 = {"DB", "Android", "MySQL", "JAVA", "SQL", "ORACLE"};

        CommonNameStringArray commonNameStringArray = new CommonNameStringArray();
        commonNameStringArray.commonString(str1, str2);
    }
}