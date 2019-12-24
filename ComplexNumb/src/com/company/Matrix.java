package com.company;

public class Matrix {
    double[][] matrix = null;
    int row = 0;
    int cols = 0;

    public Matrix(double[][] matrix) {
        this.matrix = matrix.clone();
        this.row = matrix.length;
        this.cols = matrix[0].length;
    }

    public static double[][] sumMatrix(Matrix a, Matrix b) {
        double c[][] = new double[a.row][a.cols];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }

        return c;

    }
    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < matrix.length ; i++) {// количество строк
            for (int j = 0; j < matrix[0].length ; j++) {//количество столбцов
                res += matrix[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

}
