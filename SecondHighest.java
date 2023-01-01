public class SecondHighest {

    void print(int[] arr) {
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        int secondHighest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }

    public static void main(String[] args) {
        int[] arr = {9, 76, 4, 5, 23, 56, 89, 0};

        SecondHighest secondHighest = new SecondHighest();
        secondHighest.print(arr);
        secondHighest.print1(arr);
    }

    void print1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Highest By Sorting : "+arr[1]);
    }
}
