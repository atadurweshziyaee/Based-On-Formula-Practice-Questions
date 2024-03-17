import java.util.Scanner;

public class MetreToInch{
    public static void main(String[] args) {

        double metre = userInputMetre();
        double result = metreToInch(metre);
        resultMetreToFoot(metre, result);
        
    }

    // converting (Metre to Inch).
    public static double metreToInch(double metre) {
        return metre * 39.3701d; // 1 meter ≈ 39.3701 inches
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (Metre to inch).
    public static void resultMetreToFoot(double metre1, double inch){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tInch");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+inch);
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