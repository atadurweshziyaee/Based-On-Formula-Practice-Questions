import java.util.Scanner;

public class KilometreToMicrometre{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToMicrometre(kilometre);
        resultKilometreToMicrometre(kilometre, result);
        
    }

    // this method is for converting the kilometre to micrometre.
    public static double kilometreToMicrometre(double kilometre4) {
        return kilometre4 * 1_000_000_000.0d; // 1 kilometer = 1,000,000,000 micrometers.
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to centimetre).
    public static void resultKilometreToMicrometre(double kilometre2, double micrometre){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tMicrometre");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+micrometre);
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