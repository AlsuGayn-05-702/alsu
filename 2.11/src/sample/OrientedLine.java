package sample;

public class OrientedLine {
    double k;
    double b;
    int orientation;
    public OrientedLine(double k, double b, int orientation){
        this.k = k;
        this.b = b;
        this.orientation = orientation;
    }
    @Override
    public String toString(){
        return k + "*x +" + b;
    }
    public double ValueOnX(double x ){
        return k*x+b;
    }
    public int PositionOfPoint(Point p){
        double lineY=ValueOnX(p.x);
        if(lineY>p.y){
            return -1*orientation;
        } else {
            if (lineY==p.y){
                return 0*orientation;
            }else
                return 1*orientation;
        }

    }
}