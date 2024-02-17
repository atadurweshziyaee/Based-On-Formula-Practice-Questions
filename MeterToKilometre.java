
import java.util.Scanner;

public class MeterToKilometre {
    public static void main(String args[]){

        // taking input in metre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Metre (m) to Kilometre (m) Enter:- ");
        double m = sc.nextDouble();

        //calling mToKm() method.
        double result = kmToM(m);
        System.out.println("========================================================");
        System.out.println("\n\n Metre \t\t\t: "+m+"m\n           \t to");
        System.out.println("Kilometre           \t\t: "+result+"km");
        System.out.println("========================================================");
    }

    // it will convert Metre to Kilometre.
    public static double kmToM(double m){
        double km = (double)m / 1000.0d;
        return km;
    }
}