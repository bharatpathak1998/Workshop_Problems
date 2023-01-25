public class CharCountByStr {

    void print(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            char[] ch = arr[i].toLowerCase().toCharArray();
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] == 'a') {
//                    count++;
//                }
//            }
            String str = arr[i].toLowerCase();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'a') {
                    count++;
                }
            }
//
        }
        System.out.println("Count 'a' : " + count);
    }

    public static void main(String[] args) {
        String[] arr = {"Bharat", "Yash", "Mohit", "Aniket"};

        CharCountByStr charCountByStr = new CharCountByStr();
        charCountByStr.print(arr);
    }
}
