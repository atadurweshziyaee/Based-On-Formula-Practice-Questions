import java.util.Scanner;

public class KilometreToMetre {
    public static void main(String args[]){

        // taking input in Kilometre.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert Kilometre (km) to Metre (m) Enter:- ");
        double km = sc.nextDouble();

        //calling kmToM() method.
        double result = kmToM(km);
        System.out.println("========================================================");
        System.out.println("\n\n Kilometre \t\t\t: "+km+"km\n           \t to");
        System.out.println("Metre           \t\t: "+result+"m");
        System.out.println("========================================================");
    }

    // it will convert Kilometer to Metre.
    public static double kmToM(double km){
        double metre = (double)km * 1000.0d;
        return metre;
    }
}