public class GenericStringInt {
    <E> void print(E[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] num = {55, 3, 66, 2, 8, 7, 9, 34, 6};
        String[] name = {"Bharat", "Yash", "Mohit", "Pranav"};

        GenericStringInt generics = new GenericStringInt();
        generics.print(num);
        generics.print(name);
    }
}
