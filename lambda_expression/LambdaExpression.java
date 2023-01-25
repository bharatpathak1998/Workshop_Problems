package lambda_expression;

import java.util.Scanner;

@FunctionalInterface
interface ICalculation {
    void calculation(int a, int b);
}


public class LambdaExpression {
    public static void main(String[] args) {

        ICalculation iCalculation = (a, b) -> {
            int sum = a + b;
            System.out.println("Sum of two numbers : " + sum);
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        iCalculation.calculation(a, b);
    }
}
