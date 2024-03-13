import java.util.Scanner;

public class KilometreToMile{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToMile(kilometre);
        resultKilometreToMile(kilometre, result);
        
    }

    // this method is for converting the kilometre to Mile.
    public static double kilometreToMile(double kilometre6) {
        return kilometre6 / 1.60934d; // 1 mile ≈ 1.60934 kilometers.
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to Mile).
    public static void resultKilometreToMile(double kilometre2, double mile){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tMile");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+mile);
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