import java.util.Scanner;

public class KilometreToYard{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToYard(kilometre);
        resultKilometreToYard(kilometre, result);
        
    }

    // this method is for converting the kilometre to yard.
    public static double kilometreToYard(double kilometre7) {
        return kilometre7 * 1093.61d; // 1 kilometer = 1093.61 yards
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to Yard).
    public static void resultKilometreToYard(double kilometre2, double yard){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tYard");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+yard);
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