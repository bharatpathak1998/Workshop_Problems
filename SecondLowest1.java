public class SecondLowest1 {
    public void withoutSort(int[] array) {
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        int secondLowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < secondLowest && array[i] != lowest) {
                secondLowest = array[i];
            }
        }
        System.out.println(secondLowest);
    }

    public static void main(String[] args) {
        int[] array = {23, 54, 17, 2, 8, 3, 98, 56, 44, 87};

        SecondLowest1 secondLowest1 = new SecondLowest1();
        secondLowest1.withoutSort(array);
    }
}