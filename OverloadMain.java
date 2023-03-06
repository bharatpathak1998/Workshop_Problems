public class OverloadMain {

    static void display() {
        System.out.println("bharat");
    }

    static {
        System.out.println("yash");
    }

    public static void main(String[] args) {
        System.out.println("snaskruti");
        display();
    }

    static {
        System.out.println("mohit");
    }
}