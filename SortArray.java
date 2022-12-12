public class SortArray {
    void sortArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 2, 6, 0, 3};

        SortArray sortArray = new SortArray();
        sortArray.sortArr(arr);
    }
}
