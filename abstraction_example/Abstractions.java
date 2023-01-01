package abstraction_example;

public class Abstractions {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.print();
        penguin.fly();
        penguin.sound();
        penguin.swim();

        System.out.println();

        Bird1 penguin1 = new Penguin();
        penguin1.print();
        penguin1.fly();
        penguin1.swim();

    }
}

interface Bird1 {
    void swim();
    void fly();

    default void print() {
        System.out.println("oKOKOK");
    }
}

class Penguin implements Bird1 {

    @Override
    public void swim() {
        System.out.println("abstraction_example.Penguin Can Swim");
    }

    @Override
    public void fly() {
        System.out.println("abstraction_example.Penguin Can Not Fly");
    }

    public void sound() {
        System.out.println("hsjdvsdnn");
    }
}