package com.company;

public class Line {
    double k;
    double b;

    public Line(double k, double b){
        this.k = k;
        this.b = b;

    }
    @Override
    public String toString(){
        return k + "*x +" + b;
    }

    public static boolean isParallel(Line l1, Line l2) {
        if( l1.k == l2.k){
            return  true;
        }
        return false;
    }

    public static Point getCommonPoint(Line l1, Line l2){
        double x = (l2.b - l1.b)/(l1.k - l2.k);
        double y = l1.ValueOnX(x);

        return new Point(x, y);
    }



    public double ValueOnX(double x ){
        //Находить значение точки
        return k*x+b;
    }

}
