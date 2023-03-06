package coupling;

public interface Vehicles {
    void start();
}

class Bike implements Vehicles {

    @Override
    public void start() {
        System.out.println("By kick Start");
    }
}

class Car implements Vehicles {

    @Override
    public void start() {
        System.out.println("By self Start");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Bike();
        vehicles.start();
        Vehicles vehicles2 = new Car();
        vehicles2.start();
    }
}