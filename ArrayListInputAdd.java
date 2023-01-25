import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputAdd {

    void print(ArrayList<Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element you want to add in list : ");
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(num);

        System.out.println("Enter all the elements : ");
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        ArrayListInputAdd arrayListInputAdd = new ArrayListInputAdd();
        arrayListInputAdd.print(list);
    }
}
