import java.util.Scanner;

public class CompoundInterest {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        float principal = sc.nextFloat();

        System.out.println("Enter the rate (per annum): ");
        float rate = sc.nextFloat();

        System.out.println("Enter the time (year): ");
        int time = sc.nextInt();

        System.out.println("Enter the compounding in (1 for yearly )\n(2 for half yearly)\n(4 for quarterly)");
        int n = sc.nextInt();

        double result = compoundInterest(principal, rate, time, n);

        double totalAmmount = result + principal;

        System.out.println("Your principal ammount is "+principal);
        System.out.println("Your compound interest is "+result);
        System.out.println("Your total ammount is "+totalAmmount);

    }


    public static double compoundInterest(float principal, float rate, int time, int n){

        double compoundInterest = (double) principal * (Math.pow((1+rate/100),n*time));
        
        return compoundInterest;
    }
}