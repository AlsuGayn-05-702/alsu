package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите x1:");
        String line1 = reader.readLine();
        double x1 = Integer.parseInt(line1);
        System.out.println("Введите y1:");
        String line2 = reader.readLine();
        double y1 = Integer.parseInt(line2);
        System.out.println("Введите z1:");
        String line3 = reader.readLine();
        double z1 = Integer.parseInt(line3);
        Vector vector = new Vector(x1, y1, z1);

        System.out.println("Введите x2:");
        String line_1 = reader.readLine();
        double x2 = Integer.parseInt(line_1);
        System.out.println("Введите y2:");
        String line_2 = reader.readLine();
        double y2 = Integer.parseInt(line_2);
        System.out.println("Введите z2:");
        String line_3 = reader.readLine();
        double z2 = Integer.parseInt(line_3);
        Vector vector2 = new Vector(x2, y2, z2);

        System.out.println(vector.length());
        System.out.println(vector2.length());
        System.out.println(vector.scalyarMult(vector, vector2));


    }


}
