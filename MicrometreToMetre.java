
import java.util.Scanner;

public class MicrometreToMetre {
    public static void main(String args[]){

        // taking input in MicroMetre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Micrometre to Metre Enter:- ");
        double micrometre = sc.nextDouble();

        //calling micrometreToMetre() method.
        double result = mToMicrometre(micrometre);
        System.out.println("========================================================");
        System.out.println("\n\n Micrometre \t\t\t: "+ micrometre+" micrometre\n           \t to");
        System.out.println("Metre           \t\t: "+result+"m");
        System.out.println("========================================================");
    }

    // it will convert microMetre to metre.
    public static double mToMicrometre(double micrometre){
        double metre = (double)micrometre / 1000000.0d;
        return metre;
    }
}