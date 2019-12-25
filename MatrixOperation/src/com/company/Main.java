package com.company;

import static com.company.Matrix.*;


public class Main {

    public static void main(String[] args) {
        double[][] matrix = {{2, 5, 4}, {1, 3, 2}, {2, 10, 9}};
        System.out.println(new Matrix(matrix));
        Matrix m = new Matrix(matrix);
        System.out.println(det(matrix));
        System.out.println(retromarciaMatrix(matrix));
        System.out.println(Matrix.multyMatrixonNumber(matrix, 2));
        double[][] k = {{1, 0, 1}, {0, 2, -1}, {3, -1, 0}};

        Matrix m2 = new Matrix(k);
        System.out.println(retromarciaMatrix(matrix));

        double [] b = {30, 150, 110};
        printArray(Matrix.kramerMatrix(matrix, b));


    }

    public static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
