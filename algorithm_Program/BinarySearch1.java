package algorithm_Program;

public class BinarySearch1 {

    public int binarySearch(String[] str, String word) {

        int start = 0, end = str.length;
        while (start < end) {
            int mid = start + (end - start) / 2;

            int result = word.compareTo(str[mid]);

            if (result == 0) {
                return mid;
            }

            if (result > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] str = {"Apple", "Pineapple", "Banana", "Orange"};

        BinarySearch1 binarySearch = new BinarySearch1();
        int result = binarySearch.binarySearch(str, "Orange");
        if (result == -1) {
            System.out.println("Please Enter Word From Array!");
        } else {
            System.out.println(result);
        }
    }
}
