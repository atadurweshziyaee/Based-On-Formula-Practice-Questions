import java.util.Scanner;

public class MetreToKilometre{
    public static void main(String[] args) {

        double kilometre = userInputMetre();
        double result = metreToKilometre(kilometre);
        resultMetreToKilometre(kilometre, result);
        
    }

    // converting (Metre to Kilometre).
    public static double metreToKilometre(double meter1) {
        return meter1 / 1000.0d; // 1 kilometer = 1000 meters
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (Metre to Kilometre).
    public static void resultMetreToKilometre(double metre1, double Kilometre){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tKilometre");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+Kilometre);
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