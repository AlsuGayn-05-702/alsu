package com.company;

public class Main {

    public static void main(String[] args) {

        double[][] test = new double[2][2];
        test[0][0] = 2;
        test[1][0] = 3;
        test[0][1] = 6;
        test[1][1] = 2;
        double[][] test1 = new double[1][1];
        test1[0][0] = 13;
        Matrix M1 = new Matrix(test1);
        System.out.println(M1);
        System.out.println(Matrix.det(test1));
        Matrix M = new Matrix(test);
        System.out.println(M);
        System.out.println(Matrix.det(test));

    }
}
