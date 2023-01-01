public class SecondMaxRepeated {
    public static void main(String[] args) {
        int[] arr = {1, 7, 1, 4, 0, 9, 19, 3, 8, 7, 1};

        int maxCount = 0;
        int maxValue = 0;
        int secondMaxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            } else if (arr[i] != maxValue) {
                secondMaxValue = arr[i];
            }
        }
        System.out.println("Second maximum repeated number is : " + secondMaxValue);
    }
}