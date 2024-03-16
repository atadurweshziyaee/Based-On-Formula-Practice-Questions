import java.util.Scanner;

public class MetreToFoot{
    public static void main(String[] args) {

        double metre = userInputMetre();
        double result = metreToFoot(metre);
        resultMetreToFoot(metre, result);
        
    }

    // converting (Metre to Foot).
    public static double metreToFoot(double metre) {
        return metre * 3.28084d; // 1 meter ≈ 3.28084 feet
    }

    public static double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // this method is used for printing the result in good formate (Metre to millimetre).
    public static void resultMetreToFoot(double metre1, double foot){
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\tMetre\t\t--->\t\tFoot");
        System.out.println("\t=================================================================================");
        System.out.println("\t\t\t\t"+metre1+"\t\t\t\t\t\t"+foot);
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