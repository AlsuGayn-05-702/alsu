package home_work;

import java.util.Arrays;

public class Array {
    int[] array;
    int[] quickSort;
    int[] signArray;
    int[] withoutNullArray;

    public Array(ArrayBuilder builder){
        this.quickSort = builder.getQuickSort();
        this.signArray = builder.getSignArray();
        this.withoutNullArray = builder.withoutNullArray;

    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                ", quickSort=" + Arrays.toString(quickSort) +
                ", signArray=" + Arrays.toString(signArray) +
                ", withoutNullArray=" + Arrays.toString(withoutNullArray) +
                '}';
    }
}
