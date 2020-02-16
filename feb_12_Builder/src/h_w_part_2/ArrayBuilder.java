package h_w_part_2;

public class ArrayBuilder {
    int[] array;
    int max = 0;
    int min = 0;
    double mid = 0;

    public int[] quickSort(int[] array, int low, int high) {
        this.array = array;
        if (array.length == 0) {
            return array;
        }

        if (low >= high)
            return array;


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


        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
        return array;

    }

    public int[] signArray(int[] array) {
        this.array = array;

        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
        return array;
    }

    public int[] withoutNullArray(int[] array) {
        this.array = array;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }

        }
        return array;
    }


    public ArrayBuilder max(int[] array) {
        this.array = array;
        int max = array[0];
        this.max = max;
        return this;
    }

    public ArrayBuilder min(int[] array){
        this.array = array;
        int min = array[array.length-1];
        this.min = min;
        return this;
    }

    public ArrayBuilder mid(int[] array){
        this.array = array;
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = sum + array[i];
        }
        double mid = sum/array.length;
        this.mid = mid;
        return this;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getMid() {
        return mid;
    }


    public Array build(){
        return new Array(this);
    }
}
