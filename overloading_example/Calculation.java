package overloading_example;

public class Calculation {

    public void print(int a, int b) {
        int sum = a + b;
        System.out.println("Sum Of Two Numbers : " + sum);
    }

    public void print(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum Of Three Numbers : " + sum);
    }

    public void print(String name, int age) {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    public static double print(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum Of Two Decimal Numbers : " + print(2.0, 2.9));

        Calculation calculation = new Calculation();
        calculation.print(1, 2, 3);
        calculation.print(1, 2);

        calculation.print("Bharat", 24);
    }
}
