public class ReplaceFromInt {
    void replaceNum(int num) {
        char[] ch = Integer.toString(num).toCharArray();
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == '0') {
                ch[j] = '1';
            } else {
                ch[j] = '0';
            }
        }
        System.out.print(ch);
    }

    public static void main(String[] args) {
        int num = 1001001010;

        ReplaceFromInt replaceFromInt = new ReplaceFromInt();
        replaceFromInt.replaceNum(num);
    }
}