package abstraction_example;

interface Bird {
    void fly();
}

class Pigeon implements Bird {
    @Override
    public void fly() {
        System.out.println("Pigeon can fly");
    }
}

class Owl implements Bird {
    @Override
    public void fly() {
        System.out.println("Owl can fly");
    }
}

class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}

class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow can fly");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {

        Bird pigeon = new Pigeon();
        pigeon.fly();

        Bird owl = new Owl();
        owl.fly();

        Bird eagle = new Eagle();
        eagle.fly();

        Bird crow = new Crow();
        crow.fly();
    }
}