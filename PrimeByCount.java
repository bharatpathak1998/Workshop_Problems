public class PrimeByCount {

    void primeNumbers() {
        int count;
        for (int i = 2; i <= 1000; i++) {
            count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        PrimeByCount primeByCount = new PrimeByCount();
        primeByCount.primeNumbers();
    }
}
