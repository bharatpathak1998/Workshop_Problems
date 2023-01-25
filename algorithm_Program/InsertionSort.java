package algorithm_Program;

import java.util.Arrays;

public class InsertionSort {

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
        System.out.print(Arrays.toString(arr)+" ");

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);

        System.out.println("\nAfter Insertion Sort : ");
        System.out.print(Arrays.toString(arr)+" ");
    }
}
