
import java.util.Scanner;

public class MetreToNanometre {
    public static void main(String args[]){

        // taking input in metre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Metre to Nanometre Enter:- ");
        double metre = sc.nextDouble();

        //calling metreToNanometre() method.
        double result =nanometreToMetre(metre);
        System.out.println("========================================================");
        System.out.println("\n\n metre \t\t\t: "+ metre+" m\n           \t to");
        System.out.println("Nanometre           \t\t: "+result+" Nanometer");
        System.out.println("========================================================");
    }

    // it will convert metre to nanometre.
    public static double nanometreToMetre(double metre){
        double nanometre = (double)metre * 1.0e9;
        return nanometre;
    }
}