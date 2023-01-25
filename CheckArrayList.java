import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArrayList {

    public boolean print(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        boolean flag = false;

        if (list1.equals(list2)) {
            System.out.println("l1==l2");
            flag = true;
        } else {
            System.out.println("l1!=l2");
        }

        if (list2.equals(list3)) {
            System.out.println("l2==l3");
            flag = true;
        } else {
            System.out.println("l2!=l3");
        }

        if (list3.equals(list1)) {
            System.out.println("l3==l1");
            flag = true;
        } else {
            System.out.println("l3!=l1");
        }

        return flag;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 4, 5, 7, 2));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 5));
        List<Integer> list2 = new ArrayList<>(List.of(1, 4, 5, 7, 2));

        CheckArrayList checkArrayList = new CheckArrayList();
        System.out.println("Check Condition : " + checkArrayList.print(list1, list2, list3));
    }
}