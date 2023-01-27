public class ReverseString1 {

    void print(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
//            char[] chars = str.toCharArray();
//            System.out.print(chars[i]);

            System.out.print(str.charAt(i));
        }

//        StringBuilder sb = new StringBuilder();
//        sb.append(str).reverse();
//        System.out.println(sb);
    }

    public static void main(String[] args) {

        String str = "Bharat is good boy";

        ReverseString1 reverseString1 = new ReverseString1();
        reverseString1.print(str);
    }
}
