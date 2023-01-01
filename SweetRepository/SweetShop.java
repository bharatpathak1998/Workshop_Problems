package SweetRepository;

public class SweetShop {

    public static void print(String sweet) {
        System.out.println("I like "+ sweet);
    }

//    public static <E extends String> void print(E e) {
//        System.out.println("I like " + e);
//    }

    public static void main(String[] args) {
        Barfi barfi = new Barfi();
        print(barfi.name);
        Chocolate chocolate = new Chocolate();
        print(chocolate.name);
        Laddu laddu = new Laddu();
        print(laddu.name);
        Jalebi jalebi = new Jalebi();
        print(jalebi.name);
    }
}