package algorithm_Program;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 2, 0, 4, 2, 1};
        System.out.println("Before Insertion Sort : ");
        for (int array : arr) {
            System.out.print(array + " ");
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        System.out.println("\nAfter Insertion Sort : ");
        for (int array : arr) {
            System.out.print(array + " ");
        }
    }
}