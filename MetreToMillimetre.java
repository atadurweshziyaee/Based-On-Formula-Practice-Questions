import java.util.Scanner;

public class MetreToMillimetre{
    public static void main(String[] args) {

        double kilometre = userInputMetre();
        double result = metreToMillimetre(kilometre);
        resultMetreToMillimetre(kilometre, result);
        
    }

    // converting (Metre to Millimeter).
    public static double metreToMillimetre(double metre3) {
        return metre3 * 1000.0d; // 1 meter = 1000 millimeters
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (Metre to millimetre).
    public static void resultMetreToMillimetre(double metre1, double millimetre){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tMillimetre");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+millimetre);
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