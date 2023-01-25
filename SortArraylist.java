import java.util.ArrayList;
import java.util.Arrays;

public class SortArraylist {

    void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(56, 0, 3, 89, 2, 5, 7, 1));

        SortArraylist sortArraylist = new SortArraylist();
        sortArraylist.print(list);
    }
}