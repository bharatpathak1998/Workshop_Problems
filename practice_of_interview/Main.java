package practice_of_interview;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Goat();
        Animal animal2 = new Deer();
        IBird duck = new Duck();

        animal.hack();
        animal2.hack();
        duck.fly();
        duck.eat();
    }
}


abstract class Animal {
    abstract void hack();
}

class Goat extends Animal {
    @Override
    void hack() {
        System.out.println("Hello G.O.A.T");
    }
}

class Deer extends Animal {

    @Override
    void hack() {
        System.out.println("Hello -> G.O.A.T");
    }
}

interface IBird {
    default void fly() {
        System.out.println("Birds");
    }

    void eat();
}

class Duck implements IBird {
    public void fly() {
        System.out.println("Birds2");
    }

    @Override
    public void eat() {
        System.out.println("Duck can eat");
    }
}