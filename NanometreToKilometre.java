
import java.util.Scanner;

public class NanometreToKilometre {
    public static void main(String args[]){

        // taking input in Nanometre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Nanometre to Kilometre Enter:- ");
        double nano = sc.nextDouble();

        //calling nanometreToKilometre() method.
        double result =nanometreToMetre(nano);
        System.out.println("========================================================");
        System.out.println("\n\n Nanometre \t\t\t: "+ nano+" nanometre\n           \t to");
        System.out.println("Kilometre           \t\t: "+result+" Kilometre");
        System.out.println("========================================================");
    }

    // it will convert nanometre to kilometre.
    public static double nanometreToMetre(double nano){
        return nano / 1e12d;
    }
}