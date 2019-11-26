package sample;
public class Point {

    double x;
    double y;

    //метод совпадает с названием класса

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    @Override

    public String toString(){

        return "x = "+ x + "| y = " + y;

    }



}
