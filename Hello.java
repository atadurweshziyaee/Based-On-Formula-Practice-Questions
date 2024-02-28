import java.util.Scanner;

public class NanometreToMetreConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in nanometres: ");
        double nanometres = scanner.nextDouble();

        double metres = convertNanometreToMetre(nanometres);
        System.out.println(nanometres + " nanometres is equal to " + metres + " metres.");
        
        scanner.close();
    }

    public static double convertNanometreToMetre(double nanometres) {
        return nanometres / 1_000_000_000.0;
    }
}
