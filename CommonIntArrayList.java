import java.util.ArrayList;
import java.util.Arrays;

public class CommonIntArrayList {
    public boolean commonIntList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = false;
        if (list1.equals(list2)) {
            flag = true;
        }
        System.out.print("List is equal : ");
        return flag;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 1));

        CommonIntArrayList commonNameIntArrayList = new CommonIntArrayList();
        System.out.println(commonNameIntArrayList.commonIntList(list1, list2));
    }
}