import java.util.Scanner;

public class KilometreToNanometre{
    public static void main(String[] args) {

        double kilometre = userInputKilometre();
        double result = kilometreToNanometre(kilometre);
        resultKilometreToNanometre(kilometre, result);
        
    }

    // this method is for converting the kilometre to Nanometre.
    public static double kilometreToNanometre(double kilometre5) {
        return kilometre5 * 1.0e15d; // 1 kilometer = 1.0e15 nanometers. means 10 X 10^15.
    }

    public static double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (kilometre to centimetre).
    public static void resultKilometreToNanometre(double kilometre2, double nanometre){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tKilometre\t\t--->\t\tNanometre");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+kilometre2+"\t\t\t\t\t\t"+nanometre);
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