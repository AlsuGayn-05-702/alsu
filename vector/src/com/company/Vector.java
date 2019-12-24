package com.company;

public class Vector {
    double x;
    double y;
    double z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
          return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalyarMult(Vector v, Vector v1){
         return v.x*v1.x + v.y*v1.y +v.z*v1.z;
    }
}
