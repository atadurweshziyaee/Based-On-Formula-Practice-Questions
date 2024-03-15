import java.util.Scanner;

public class MetreToMile{
    public static void main(String[] args) {

        double meter = userInputMetre();
        double result = metreToMile(meter);
        resultMetreToMile(meter, result);
        
    }

    // converting (Metre to Mile).
    public static double metreToMile(double metre) {
        return metre / 1609.34d; // 1 mile ≈ 1609.34 meters
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    public static void resultMetreToMile(double metre1, double mile){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tMile");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+mile);
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