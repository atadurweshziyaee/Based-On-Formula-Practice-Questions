import java.util.Scanner;

public class Discount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // taking input of original price.

        System.out.println("Enter the original price of the product:- ");
        float productPrice = sc.nextFloat();

        // How much your discount is.
        System.out.println("What is the Discount (% off) :- ");
        float discount = sc.nextFloat();

        float result = discount(productPrice, discount);

        float discountRate = productPrice - result;
        System.out.println("Your Final price after discount is "+discountRate);


        

    }

    public static float discount(float productPrice, float discount){

        float percentage = productPrice * (discount)/100;

        return percentage;
    }
}