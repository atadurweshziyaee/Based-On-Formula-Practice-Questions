import java.util.Scanner;

public class KilometreToCentimetre{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToCentimetre(kilometre);
        resultKilometreToCentimetre(kilometre, result);
        
    }

    // this method is for converting the kilometre to centimetre.
    public static double kilometreToCentimetre(double kilometre2) {
        return kilometre2 * 100000.0d; // 1 kilometer = 100000 centimeters.
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to centimetre).
    public static void resultKilometreToCentimetre(double kilometre2, double centimetre){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tCentimetre");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+centimetre);
        holdScreen();
    }

    // this will hold the screen whenever you entered any key.
    public static void holdScreen()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tPress any key to continue . . . ");
        sc.nextLine();
    }
}