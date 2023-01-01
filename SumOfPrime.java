public class SumOfPrime {

    void isPrime() {
        int j;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfPrime sumOfPrime = new SumOfPrime();
        sumOfPrime.isPrime();
    }
}
