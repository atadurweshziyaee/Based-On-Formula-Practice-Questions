
import java.util.Scanner;

public class NanometreToMetre {
    public static void main(String args[]){

        // taking input in nanometre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Nanometre to Metre Enter:- ");
        double nanometre = sc.nextDouble();

        //calling NanometreToMetre() method.
        double result =nanometreToMetre(nanometre);
        System.out.println("========================================================");
        System.out.println("\n\n Nanometre \t\t\t: "+ nanometre+" metre\n           \t to");
        System.out.println("Metre           \t\t: "+result+"m");
        System.out.println("========================================================");
    }

    // it will convert nanoMetre to metre.
    public static double nanometreToMetre(double nanometre){
        double metre = (double)nanometre / 1000000000.0d;
        return metre;
    }
}