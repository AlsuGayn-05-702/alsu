package com.company;

public class Complex {
    int Im;
    int Re;
    public Complex(int Re, int Im){
        this.Im = Im;
        this.Re = Re;
    }
    public Complex sumComplex(Complex a, Complex b){
        int cRe = a.Re+b.Re;
        int cIm = a.Im+b.Im;
        Complex c = new Complex(cRe, cIm);
        return c;
    }

    public Complex multComplex(Complex a, Complex b){
        int cRe = a.Re*b.Re - a.Im*b.Im;
        int cIm = a.Im*b.Re +a.Re*b.Im;
        Complex c = new Complex(cRe, cIm);
        return c;

    }

    public int module(Complex c){
        double n = Math.sqrt(c.Re*c.Re + c.Im*c.Im);
        int module = (int) n;
        return module;
    }

    public void print(){
        String res = "";
        res = Re + "+" +  Im + "i";
        System.out.println(res);

    }
}
