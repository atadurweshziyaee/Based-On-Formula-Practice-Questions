import java.util.Scanner;

public class KilometreToInch{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToInch(kilometre);
        resultKilometreToInch(kilometre, result);
        
    }

    // this method is for converting the kilometre to inch.
    public static double kilometreToInch(double kilometre9) {
        return kilometre9 * 39370.1d; // 1 kilometer ≈ 39370.1 inches
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to Inch).
    public static void resultKilometreToInch(double kilometre2, double inch){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tInch");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+inch);
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