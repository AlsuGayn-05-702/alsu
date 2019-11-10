package sample;

public class Complex {
    int Re;
    int Im;

    public Complex(){
        Re = 0;
        Im = 0;
    }
    public Complex(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }

    public void  print(){
        System.out.println(Re + "+" + Im + "i");
    }
}