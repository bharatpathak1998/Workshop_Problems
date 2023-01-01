public class ReplaceIntChar {
    void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            char[] ch = Integer.toString(arr[i]).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '0') {
                    ch[j] = '1';
                } else if (ch[j] == '1') {
                    ch[j] = '0';
                }
            }
            System.out.print(String.valueOf(ch) + " ");
        }
    }
    public static void main(String[] args) {
//        int[] arr = {1001, 1101, 1111, 0011, 0001, 1010, 0101};
        int[] arr = {1001, 1101, 1111, 1010};

        ReplaceIntChar replaceIntChar = new ReplaceIntChar();
        replaceIntChar.print(arr);
    }
}
