package com.company;

public class Matrix {
    int rows = 0;
    int cols = 0;
    double[][] m;
    public Matrix(double[][] m){
        this.m = m.clone();
        rows = this.m.length;
        cols = this.m[0].length;
    }

    public static double det(double[][] matrix){
        if(matrix.length == 1){
            return matrix[0][0];
        }
        double result = 0; //будем добавлять эдементы
        for (int i = 0; i <matrix.length ; i++) {
            double[][] minor = createMinor(matrix,0,i);
            int sign = 1; //знак минора
            if(i % 2 == 0){
                sign =1;
            } else {
                sign = -1;
            }
            result += sign*matrix[0][i]*det(minor);

        }

        return result;
    }

    public static double[][] createMinor(double[][] m, int row, int column){
        double[][] minor = new double[m.length -1][m[0].length -1];
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m.length ; j++) {
                if(i == row || j ==column){
                    continue;
                }
                int rowIndex = 0;
                int colIndex = 0;//куда будем класть минор
                if(i > row){
                    rowIndex = i -1;
                }else{
                    rowIndex =i;
                }
                if(j > column){
                    colIndex = j -1;
                }else {
                    colIndex = j;
                }
                minor[rowIndex][colIndex] = m[i][j];

            }

        }
        return  minor;

    }

    @Override
    public  String toString(){
        String res = "";
        for (int i = 0; i <m.length ; i++){
            for (int j = 0; j <m[0].length ; j++) {
                res += m[i][j] + " ";
            }
            res += "\n"; //перевод строки
        }
        return  res;
    }
}
