package overriding_example;

public class Override {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        parent.print();

        Parent child = new Child();
        child.print();
    }
}

class Parent {
    void print() {
        System.out.println("Parent Class Method");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child Class Method");
    }
}