package home_work;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,6,1,5,-2};
        int low = 0;
        int hight = array.length - 1;
        Array a = new ArrayBuilder().quickSort(array,low,hight).withoutNullArray(array).signArray(array).build();
        System.out.println(a);
    }
}
