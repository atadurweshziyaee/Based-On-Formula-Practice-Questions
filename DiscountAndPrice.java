import java.util.Scanner;

public class DiscountAndPrice {
    public static void main(String args[]){

        // Taking user input.
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            // for Screen clear.
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Shopping Amount\t\t\t\tDiscount\n");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("<=800\t\t\t\t\t\tNo discount\n>800 and <=1500\t\t\t\t\t10%\n>1500 and <=2500\t\t\t\t15%\n>2500 and <=5000\t\t\t\t20%\n>5000\t\t\t\t\t\t30%\n");
            
            System.out.println("Enter the original price:- ");
            float totalProductPrice = sc.nextFloat();
            
            // discount in percentage (% off).
            float discount = 0.0f;
            
            float afterDiscount = discountAndPrice(totalProductPrice, discount);

            float totalPrice = totalProductPrice - afterDiscount;

            System.out.println("Original product price:- "+totalProductPrice);
            System.out.println("Price After Discount :- "+afterDiscount);
            System.out.println("You saved "+totalPrice);

            System.out.println("press zero (0) for exit.");
            int choice = sc.nextInt();
            if(choice == 0){
                flag = false;
                // System.exit(0);
            }
            else{
                flag = true;
            }

        }
    }

    public static float discountAndPrice(float totalProductPrice, float discount){

        
        if(totalProductPrice > 800 && totalProductPrice <=1500){
            System.out.println("\tYou have saved your money 10% Congratulation");
            return discount(totalProductPrice, 10.f);
        }
        else if(totalProductPrice >1500 && totalProductPrice <=2500){
            System.out.println("\tYou have saved your money 15% Congratulation");
            return discount(totalProductPrice, 15.f);
        }
        else if(totalProductPrice > 2500 && totalProductPrice <= 5000){
            System.out.println("\tYou have saved your money 20% Congratulation");
            return discount(totalProductPrice, 20);
        }
        else if(totalProductPrice > 5000){
            System.out.println("\tYou have saved your money 30% Congratulation");
            return discount(totalProductPrice, 30);
        }
        System.out.println("\t\t\t\t Sorry No Discount !!!!");
        return 0.0f;
    }

    public static float discount(float totalProductPrice, float discount){

        float totalDiscount = totalProductPrice * (discount)/100;
        float totalDiscountPrince = totalProductPrice - totalDiscount;
        return totalDiscountPrince;
    }
}