import java.util.Scanner;

public class MetreToNauticalMile{
    public static void main(String[] args) {

        double metre = userInputMetre();
        double result = metreToNauticalMile(metre);
        resultMetreToNauticalMile(metre, result);
        
    }

    // converting (Metre to nautical Mile).
    public static double metreToNauticalMile(double metre) {
        return metre / 1852.0d; // 1 nautical mile ≈ 1852 meters
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (Metre to Nautical mile).
    public static void resultMetreToNauticalMile(double metre1, double nauticalMile){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tNautical Mile");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+nauticalMile);
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