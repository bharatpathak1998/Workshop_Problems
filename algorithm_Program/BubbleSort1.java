package algorithm_Program;

public class BubbleSort1 {

    public void bubbleSort(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] str = {"Grapes", "Banana", "Pineapple", "Orange", "Apple"};
        System.out.println("Before Insertion Sort : ");
        for (String array : str) {
            System.out.print(array + " ");
        }

        BubbleSort1 bubbleSort = new BubbleSort1();
        bubbleSort.bubbleSort(str);

        System.out.println("\nAfter Insertion Sort : ");
        for (String array : str) {
            System.out.print(array + " ");
        }
    }
}