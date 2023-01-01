package Generics;

public class Generics {
    public <E> void myMethod(E[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] num = {55, 3, 66, 2, 8, 7, 9, 34, 6};
        String[] name = {"Bharat", "Yash", "Mohit", "Pranav"};

        Generics generics = new Generics();
        generics.myMethod(num);
        generics.myMethod(name);
    }
}
