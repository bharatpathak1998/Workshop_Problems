public class ExceptMinMax {

    void exceptMinMax(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

            if (array[i] < min)
                min = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max || array[i] == min)
                continue;
            else
                System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, 10, 89, 15, 20, 25};

        ExceptMinMax exceptMinMax = new ExceptMinMax();
        exceptMinMax.exceptMinMax(array);
    }
}
