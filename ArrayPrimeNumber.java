public class ArrayPrimeNumber {

    void primeNumbers(int[] array) {
        int j;
        for (int i = 0; i < array.length; i++) {
            for (j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    break;
                }
            }
            if (array[i] == j) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 9, 3, 0, 2, 51, 40, 41};

        ArrayPrimeNumber arrayPrimeNumber = new ArrayPrimeNumber();
        arrayPrimeNumber.primeNumbers(array);
    }
}
