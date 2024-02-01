import java.util.Scanner;

// calculating simple interest.

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        float principal = sc.nextFloat();

        System.out.println("Enter the rate (per annum): ");
        float rate = sc.nextFloat();

        System.out.println("Enter the time (year): ");
        float time = sc.nextFloat();

        double result = simpleInterest(principal, rate, time);

        double totalAmmount = result + principal;

        System.out.println("Your principal ammount is "+principal);
        System.out.println("Your simple interest is "+result);
        System.out.println("Your total ammount is "+totalAmmount);

    }

    // this method for findind the simple interest.

    public static double simpleInterest(float principal, float rate, float time){
        double interest = (double)(principal * rate * time)/100 ;
        return interest;
    }
}