
import java.util.Scanner;

public class CentimtreToMetre {
    public static void main(String args[]){

        // taking input in centimetre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert centimetre (cm) to Metre (m) Enter:- ");
        double cm = sc.nextDouble();

        //calling cmToM() method.
        double result = cmToM(cm);
        System.out.println("========================================================");
        System.out.println("\n\n centimetre \t\t\t: "+cm+"cm\n           \t to");
        System.out.println("Metre           \t\t: "+result+"m");
        System.out.println("========================================================");
    }

    // it will convert centimetre to Metre.
    public static double cmToM(double cm){
        double m = (double)cm / 100.0d;
        return m;
    }
}