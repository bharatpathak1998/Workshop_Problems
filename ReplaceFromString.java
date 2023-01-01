public class ReplaceFromString {
    void replaceNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0') {
                ch = '1';
            } else {
                ch = '0';
            }
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        String str = "0111001001011";

        ReplaceFromString replaceFromString = new ReplaceFromString();
        replaceFromString.replaceNum(str);
    }
}
