package com.company;

public class Main {

    public static void main(String[] args) {
        //÷åðåç ðåêóðñèè, íóæíî íà÷àòü ñ áàçîé ðåêóðñèè ýòî ìàòðèöà[1][1]
        double[][] test = new double[2][2];
        test[0][0] = 2;
        test[1][0] = 3;
        test[0][1] = 6;
        test[1][1] = 2;
        double[][] test1 = new double[1][2];
        test1[0][0] = 13;
        test1[0][1] = 10;
        Matrix M1 = new Matrix(test1);
        System.out.println(M1);
        Matrix M = new Matrix(test);
        System.out.println(M);
        System.out.println(Matrix.multMatrix(M1,M));
    }
}
