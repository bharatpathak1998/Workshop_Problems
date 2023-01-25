package algorithm_Program;

public class Permutation {

    public void permute(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int length = str.length();
        Permutation permutation = new Permutation();
        System.out.println("All The Permutations Of The String Are : ");
        permutation.permute(str, 0, length);
    }
}
