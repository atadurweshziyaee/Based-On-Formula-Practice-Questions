import java.util.Scanner;

public class KilometreToNauticalMile{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToNauticalMile(kilometre);
        resultKilometreToNauticalMile(kilometre, result);
        
    }

    // this method is for converting the kilometre to nautical mile.
    public static double kilometreToNauticalMile(double kilometre10) {
        return kilometre10 * 0.539957d; // 1 kilometer ≈ 0.539957 nautical miles
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to Nautical Mile).
    public static void resultKilometreToNauticalMile(double kilometre2, double nauticalMile){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tNautical Mile");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+nauticalMile);
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