public class CountVowel {

    int countVowel(String[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] str = {"Bharat", "Yash", "Aniket"};

        CountVowel countVowel = new CountVowel();
        System.out.println("Number Of Vowels : " + countVowel.countVowel(str));
    }
}
