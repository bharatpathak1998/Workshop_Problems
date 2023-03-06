package learn_counter;

public class Count1 {
    public static void main(String[] args) {
        String str = "Yash28 09 Bharat29";

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowel : " + vowelCount);
        System.out.println("Consonant : " + consonantCount);
        System.out.println("Digit : " + digitCount);
        System.out.println("Space : " + spaceCount);
    }
}
