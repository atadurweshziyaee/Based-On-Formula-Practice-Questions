
import java.util.Scanner;

public class MetreToMicrometre {
    public static void main(String args[]){

        // taking input in Metre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Metre (m) to Micrometre Enter:- ");
        double m = sc.nextDouble();

        //calling mToMicrometre() method.
        double result = mToMicrometre(m);
        System.out.println("========================================================");
        System.out.println("\n\n Metre \t\t\t: "+m+"m\n           \t to");
        System.out.println("Micrometre           \t\t: "+result+"Micrometre");
        System.out.println("========================================================");
    }

    // it will convert metre to microMetre.
    public static double mToMicrometre(double m){
        double microMetre = (double)m * 1_000_000d;
        return microMetre;
    }
}