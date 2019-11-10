package sample;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        Complex a = new Complex(-6, 8);

        a.print();

        Complex b = new Complex(1, 5);
        b.print();
        Complex c = new Complex(-9, -4);
        c.print();

        double[] array = new double[]{Math.sqrt(a.Re * a.Re + a.Im * a.Im), Math.sqrt(b.Re * b.Re + b.Im * b.Im), Math.sqrt(c.Re * c.Re + c.Im * c.Im)};

        array = sortArray(array);
        printArray(array);
    }

    public  static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public  static double[] sortArray(double [] array){
        for(int i = 0; i < array.length; i ++){
            double min = array[i];
            int min1 = i;

            for(int j = i + 1; j < array.length; j++){
                if( array[j] < min ){
                    min = array[j];
                    min1 = j;
                }
            }
            double temp = array[i];
            array[i] = min;
            array[min1] = temp;

        }


        return array;
    }
}