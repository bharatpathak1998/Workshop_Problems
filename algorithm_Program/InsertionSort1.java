package algorithm_Program;

public class InsertionSort1 {

    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while ((j > -1) && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 2, 0, 4, 2, 1};
        System.out.println("Before Insertion Sort : ");
        for (int array : arr) {
            System.out.print(array + " ");
        }

        InsertionSort1 insertionSort = new InsertionSort1();
        insertionSort.insertionSort(arr);

        System.out.println("\nAfter Insertion Sort : ");
        for (int array : arr) {
            System.out.print(array + " ");
        }
    }
}
