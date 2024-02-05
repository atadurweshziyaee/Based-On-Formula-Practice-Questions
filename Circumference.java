import java.util.Scanner;

public class Circumference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:-");
        double radius = sc.nextDouble();

        double circumferece = (double) (2 * Math.PI * radius);

        System.out.println("Your Circumferece is "+circumferece);
    }
}