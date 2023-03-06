public class AToZ {

    void print() {
        int n = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((char) n + " ");
                n += 1;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        AToZ aToZ = new AToZ();
        aToZ.print();
    }
}
