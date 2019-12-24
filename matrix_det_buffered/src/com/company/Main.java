package com.company;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;



public class Main {

    //Преобразование строки в число.
    public static int conversionInNum(String num) {
        try {
            int conNum = Integer.parseInt(num);
            return conNum;
        }catch(Exception e) {

            System.out.print("Ошибка!");
        };
        return 0;


    }



    //Печать на экран.
    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " ");

            }
            System.out.print(  "\n");

        }
    }



    public static double[][] enterMatrix() {

        InputStreamReader inputStream =  new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream );

        int a = 0, b = 0;

        try {
            System.out.print("Введите колчество строк массива: ");
            a = (int)conversionInNum(bufferedReader.readLine()); //читаем строку с клавиатуры

            System.out.print("Введите количество столбцов: ");
            b = (int)conversionInNum(bufferedReader.readLine());
        }catch(IOException e) {};



        double[][] matrix = new double[a][b];
        String number = "";
        System.out.print("Введите числа через пробел: ");

        for (int i = 0; i < matrix.length; i++) {
            try {

                boolean flag = true;

                while (flag){
                    number = bufferedReader.readLine(); //читаем строку с клавиатуры
                    String [] numberArray = number.split(" ");

                    if (number.length() == 0 || numberArray.length != b) {
                        System.out.print("Кажется, вы ошиблись. Попробуйте еще раз: ");
                        flag = true;
                    }else {
                        for (int j = 0; j < numberArray.length; j++) {
                            matrix[i][j] = conversionInNum(numberArray[j]);
                        }
                        flag = false;
                    }
                }



            }catch(IOException e) {};

        }
        return matrix;
    }



    public static void main(String[] args) {

        double[][] matrix = enterMatrix();
        int a = matrix[0].length;
        System.out.println(Matrix.det(matrix));



    }
}

