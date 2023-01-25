public class CountNumOfZero {

    int print(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0') {
                System.out.print(ch);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "098056012000350080";

        CountNumOfZero countNumOfZero = new CountNumOfZero();
        System.out.println("\nNumber Of Zero : " + countNumOfZero.print(str));
    }
}
