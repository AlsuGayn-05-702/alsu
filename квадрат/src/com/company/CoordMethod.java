package com.company;

public class CoordMethod {
    public static double dist(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2- x1)*(x2- x1) + (y2 - y1)*(y2 - y1));
    }

    public  double cosAngle(double x1,double y1,
                            double x2,double y2,
                            double x3,double y3){
        return ((x1 - x2)*(x3 - x2) + (y1 - y2)*(y3 - y2));
    }
}
