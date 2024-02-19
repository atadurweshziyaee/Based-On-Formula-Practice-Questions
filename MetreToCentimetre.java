
import java.util.Scanner;

public class MetreToCentimetre {
    public static void main(String args[]){

        // taking input in Metre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Metre (m) to Centimetre (cm) Enter:- ");
        double m = sc.nextDouble();

        //calling mToCm() method.
        double result = mToCm(m);
        System.out.println("========================================================");
        System.out.println("\n\n Metre \t\t\t: "+m+"m\n           \t to");
        System.out.println("Centimetre           \t\t: "+result+"cm");
        System.out.println("========================================================");
    }

    // it will convert metre to Centimetre.
    public static double mToCm(double m){
        double cm = (double)m * 100.0d;
        return cm;
    }
}