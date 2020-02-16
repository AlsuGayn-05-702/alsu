package home_work;

import java.util.Arrays;

public class Test {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        if (low >= high)
            return;


        int mid = low + (high - low) / 2;
        int opora = array[mid];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

    }

    public static void signArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
        return;
    }

    public static void withoutNullArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }

        } return;
    }

    public static void main(String[] args) {
        int[] x = {2, -8, -1, 3, 9, 7, 2, 4};

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        //signArray(x);
        //withoutNullArray(x);

        System.out.println(Arrays.toString(x));
    }
}
