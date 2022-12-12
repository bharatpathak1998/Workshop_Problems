public class SecondLowest {
    public void secondLowest(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[1]);
    }

    public static void main(String[] args) {
        int[] array = {23, 54, 17, 2, 8, 3, 98, 56, 44, 87};

        SecondLowest secondLowest = new SecondLowest();
        secondLowest.secondLowest(array);
    }
}
