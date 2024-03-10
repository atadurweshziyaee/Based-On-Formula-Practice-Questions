import java.util.Scanner;

public class KilometreToFeet{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToFoot(kilometre);
        resultKilometreToFeet(kilometre, result);
        
    }

    // this method is for converting the kilometre to feet.
    public static double kilometreToFoot(double kilometre8) {
        return kilometre8 * 3280.84d; // 1 kilometer ≈ 3280.84 feet
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to Feet).
    public static void resultKilometreToFeet(double kilometre2, double feet){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tFeet");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+feet);
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