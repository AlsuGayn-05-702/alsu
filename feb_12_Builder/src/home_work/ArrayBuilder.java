package home_work;

public class ArrayBuilder {
    int[] quickSort;
    int[] signArray;
    int[] withoutNullArray;

    public ArrayBuilder quickSort(int[] quickSort, int low, int high) {
        this.quickSort = quickSort;
        if (quickSort.length == 0) {
            return this;
        }

        if (low >= high)
            return this;


        int mid = low + (high - low) / 2;
        int opora = quickSort[mid];


        int i = low, j = high;
        while (i <= j) {
            while (quickSort[i] < opora) {
                i++;
            }

            while (quickSort[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = quickSort[i];
                quickSort[i] = quickSort[j];
                quickSort[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j) {
            quickSort(quickSort, low, j);
        }

        if (high > i) {
            quickSort(quickSort, i, high);
        }
        return this;

    }

    public ArrayBuilder signArray(int[] signArray) {
        this.signArray = signArray;

        for (int i = 0; i < signArray.length; i++) {
            signArray[i] = -1 * signArray[i];
        }
        return this;
    }

    public ArrayBuilder withoutNullArray(int[] withoutNullArray) {
        this.withoutNullArray = withoutNullArray;
        for (int i = 0; i < withoutNullArray.length; i++) {
            if (withoutNullArray[i] < 0) {
                withoutNullArray[i] = 0;
            }

        }
        return this;
    }

    public int[] getQuickSort() {
        return quickSort;
    }

    public int[] getSignArray() {
        return signArray;
    }

    public int[] getWithoutNullArray() {
        return withoutNullArray;
    }

    public Array build() {
        return new Array(this);
    }
}
