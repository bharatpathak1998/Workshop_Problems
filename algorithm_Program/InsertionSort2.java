package algorithm_Program;

public class InsertionSort2 {

    public void insertionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            int j = i - 1;

            while ((j > -1) && (arr[j].compareTo(temp) > 0)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        String[] str = {"Grapes", "Banana", "Pineapple", "Orange", "Apple"};
        System.out.println("Before Insertion Sort : ");
        for (String array : str) {
            System.out.print(array + " ");
        }

        InsertionSort2 insertionSort = new InsertionSort2();
        insertionSort.insertionSort(str);

        System.out.println("\nAfter Insertion Sort : ");
        for (String array : str) {
            System.out.print(array + " ");
        }
    }
}