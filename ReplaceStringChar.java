public class ReplaceStringChar {

    void print(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '0') {
                    ch[j] = '1';
                } else {
                    ch[j] = '0';
                }
                arr[i] = String.valueOf(ch);
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1001", "1101", "1111", "0011", "0001", "1010", "0101"};

        ReplaceStringChar replaceStringChar = new ReplaceStringChar();
        replaceStringChar.print(arr);
    }
}
