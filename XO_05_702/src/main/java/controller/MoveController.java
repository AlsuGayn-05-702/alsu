package controller;

import model.Field;
import model.Figure;

public class MoveController {
    public static Figure whoseTurn(Field field) {
        int sum = 0;
        int[][] a = field.getFieldArr(); // былбы статик в гет то обращались бы к самому классу филд
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];

            }
        }

        if (sum == 0) {
            return Figure.X;
        } else return Figure.O;
    }

    public static boolean makeMove(Field field, int x, int y){
        int[][] a = field.getFieldArr();
        if(a[x][y] != 0){
            return false;
        }
        Figure c = whoseTurn(field);
        if(c == Figure.X){
            a[x][y] = 1;
        } else a[x][y] = -1;
        return true;
    }

}
