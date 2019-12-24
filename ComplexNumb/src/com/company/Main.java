package com.company;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(1, 3);
        a.print();
        Complex b = new Complex(6, 3);
        b.print();
       Complex c = a.multComplex(a,b);
       c.print();
    }

}
