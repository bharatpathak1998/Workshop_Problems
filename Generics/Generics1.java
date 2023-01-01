package Generics;

public class Generics1 {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(1);
        System.out.println(intObj.getData());

        GenericsClass<String> intObj1 = new GenericsClass<>("Bharat");
        System.out.println(intObj1.getData());
    }
}

class GenericsClass<T> {
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
