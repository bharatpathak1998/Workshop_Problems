package sweet_repository;

public class SweetShop {

//    public static void print(String sweet) {
//        System.out.println("I like "+ sweet);
//    }

    public static <T extends String> void print(T t) {
        System.out.println("I like " + t);
    }

    public static void main(String[] args) {
        Barfi barfi = new Barfi();
        print(barfi.name);

//        Chocolate chocolate = new Chocolate();
//        print(chocolate.name);
//        Laddu laddu = new Laddu();
//        print(laddu.name);
//        Jalebi jalebi = new Jalebi();
//        print(jalebi.name);
    }
}