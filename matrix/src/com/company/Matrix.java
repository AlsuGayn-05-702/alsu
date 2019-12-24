package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    double[][] data = null;
    int rows = 0; //строки
    int cols = 0;// столбцы
    public Matrix(double[][] data){
        this.data = data.clone();//хранится ссылка на объект, а не сам объект(два объека, не один)
        rows = this.data.length;
        cols = this.data[0].length;
        //System.out.println("Data" + data);
    }


    public static Matrix multMatrix (Matrix M1, Matrix M2){
        if (M1.cols != M2.rows){
            throw new ColsUnequalRowsException();
        }

        double[][] resMultAr = new double[M1.rows][M2.cols];
        for (int i = 0; i < resMultAr.length; i++) {// a
            for (int j = 0; j < resMultAr[0].length; j++) {//b
                double elem = 0;
                for (int k = 0; k < M1.cols ; k++) {//c = a*b
                    elem+= M1.data[i][k]*M2.data[k][j];
                }
                resMultAr[i][j] = elem;
            }
        }
        return new Matrix(resMultAr);
    }

    /*@Override
    public String toString(){
        return Arrays.deepToString(data);
    }*/

    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < data.length ; i++) {// количество строк
            for (int j = 0; j < data[0].length ; j++) {//количество столбцов
                res += data[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

}
