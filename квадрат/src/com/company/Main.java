package com.company;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите координаты");
        double[][] coord = new double[2][4];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <4 ; j++) {
                coord[i][j] = input.nextDouble();

            }
        }
        System.out.println("массив координат");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(" " + coord[j][i]);
            }
            System.out.println("\n");
        }
        double[] l = new double[6];
        int k = 0;
        for (int i = 0; i <3 ; i++) {
            for (int j = i + 1; j <4 ; j++) {
                l[k] = CoordMethod.dist(coord[0][i],  coord[1][i],coord[0][j], coord[1][j]);
                k++;

            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("" + l[i]);
        }
        int equal0 = 1;
        int equal1 = 0;
        double difDist = 0;
        for (int i = 1; i < 6; i++) {
            if(l[i] == l[0]){
                equal0++;
            }else {
                difDist = l[i];
            }
        }
        for (int i = 0; i <6 ; i++) {
            if(l[i] == difDist){
                equal1++;
            }
        }
        if(equal0 == 2 && equal1==4){
            System.out.println("это квадрат");
        }else {
            if(equal0 == 4 && equal1 == 2){
                System.out.println("это квадрат");
            }else {
                System.out.println("это no квадрат");
            }
        }
    }

}
