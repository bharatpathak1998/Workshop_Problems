package algorithm_Program;

public class PrimeNumber {

    public void primeNumber() {
        int j;
        for (int i = 0; i <= 1000; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primeNumber();
    }
}
