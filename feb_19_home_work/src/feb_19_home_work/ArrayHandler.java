package feb_19_home_work;

import java.util.Arrays;

public class ArrayHandler {
    private int[] array;

    public ArrayHandler(int[] array) {
        this.array = array;
    }

    public ArrayHandler sort() {
        Arrays.sort(array);
        return this;
    }

    public ArrayHandler changeSign() {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return this;//текущий объект
    }


    public ArrayHandler relu() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return this;
    }

    public int findMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double mid() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double mid = sum / array.length;

        return mid;
    }

    public ArrayHandler withoutNull() {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count += 1;
            }
        }
        System.out.println(count);
        int[] newArray = new int[count];

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[a] = array[i];
                a++;
            }
        }
        array = newArray;
        return this;

    }


    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }
}
