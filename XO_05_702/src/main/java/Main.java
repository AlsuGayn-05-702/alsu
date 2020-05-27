import controller.MoveController;
import model.Field;
import model.Figure;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Field f = new Field(10);
        //System.out.println(MoveController.whoseTurn(field));
        MoveController.makeMove(f,4,4);
        //System.out.println(MoveController.whoseTurn(field));
        MoveController.makeMove(f,2,1);
        //System.out.println(MoveController.whoseTurn(field));
        whoseTurn(f);
    }

    public static Figure whoseTurn(Field field){
        int summa = 0;
        int[][] a = field.getFieldArr();

        Arrays.stream(a)
                //.map(Arrays::toString)
                .map(x -> Arrays.toString(x)) //cоздали поле
                .forEach(System.out::println);
      summa = Arrays.stream(a)
                .flatMapToInt(x -> Arrays.stream(x))
                .sum();
//     2.   summa = Arrays.stream(a)
//                .map(arr ->summa(arr))
//                .reduce(0,(acc,x) -> acc + x);
//
//     3.  summa = Arrays.stream(a)
//               .map(arr -> summa(arr))
//               .mapToInt(x -> x)
//               .sum();
        // System.out.println(summa);

       return summa == 0 ? Figure.X : Figure.O;
       // System.out.println(summa);
        //return null;
    }

    public static int summa(int[] a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        return summa;
    }
}
