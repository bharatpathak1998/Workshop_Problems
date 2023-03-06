package coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle is start");
    }
}
