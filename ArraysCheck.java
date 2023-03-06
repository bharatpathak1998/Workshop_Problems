import java.util.Arrays;

public class ArraysCheck {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 3, 5, 6};

        boolean arr = Arrays.equals(arr1, arr2);

        System.out.println("Both Are Same : " + arr);
    }
}