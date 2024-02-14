import java.util.Scanner;

public class GramToKilogram {
    public static void main(String args[]){

        // taking input in meter.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Gram (g) to Kilogram (kg) Enter:- ");
        double g = sc.nextDouble();

        //calling mToMm() method.
        double result = gToKg(g);
        System.out.println("========================================================");
        System.out.println("\n\n Gram \t\t\t: "+g+"g\n           \t to");
        System.out.println("Kilogram           \t\t: "+result+"kg");
        System.out.println("\n========================================================");
    }

    // it will convert meter to millimeter.
    public static double gToKg(double g){
        double kilogram = g / 1000.0d;
        return kilogram;
    }
}