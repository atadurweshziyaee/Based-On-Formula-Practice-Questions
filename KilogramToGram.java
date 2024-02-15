import java.util.Scanner;

public class KilogramToGram {
    public static void main(String args[]){

        // taking input in meter.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Kilogram (kg) to Gram (g) Enter:- ");
        double kg = sc.nextDouble();

        //calling mToMm() method.
        long result = kgToG(kg);
        System.out.println("========================================================");
        System.out.println("\n\n Kilogram \t\t\t: "+kg+"kg\n           \t to");
        System.out.println("Gram           \t\t: "+result+"g");
        System.out.println("========================================================");
    }

    // it will convert meter to millimeter.
    public static long kgToG(double kg){
        long gram = (long)kg * 1000;
        return gram;
    }
}