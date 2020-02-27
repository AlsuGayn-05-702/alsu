package feb_19_home_work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {15, 8, -5, 24, -13, 0, -9};
        System.out.println(Arrays.toString(a));

        ArrayHandler handler = new ArrayHandler(a);
    /*     int[] b = handler.sort();

        System.out.println(Arrays.toString(b));
        ArrayHandler h2 = new ArrayHandler(b);
        int[] c = h2.changeSign();
        System.out.println(Arrays.toString(c));*/
        handler = handler
                .withoutNull();
        System.out.println(handler);
        int max = handler.findMax();
        int min = handler.findMin();
        double mid = handler.mid();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = " + mid);

    }
}
