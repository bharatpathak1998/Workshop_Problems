import java.util.ArrayList;

public class LowerCaseProblem {

    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>();

        abc.add("Bharat");
        abc.add("Yash");
        abc.add("Smruti");

        for (int i = 0; i < abc.size(); i++) {
            String str = abc.get(i);
            for (int j = 0; j < str.length(); j++) {
                System.out.print(str.charAt(j) + " ");
            }
        }
    }
}
