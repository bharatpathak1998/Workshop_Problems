package coupling;

public class TightCoupling {
    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}

class A {
    public void stop() {
        System.out.println("Car is Stop");
    }
}

class B {
    public void method() {
        A a = new A();
        a.stop();
    }
}