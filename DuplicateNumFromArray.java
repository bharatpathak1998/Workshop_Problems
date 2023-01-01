public class DuplicateNumFromArray {
    void print(int[] arr) {
        System.out.print("Duplicate elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 5, 7, 2, 6, 8, 9, 3, 6, 4, 2, 1, 9};

        DuplicateNumFromArray duplicateNumFromArray = new DuplicateNumFromArray();
        duplicateNumFromArray.print(arr);
    }
}