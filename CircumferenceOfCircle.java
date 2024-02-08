import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius :-");
        double radius = sc.nextDouble();

        double circumference = (double)(2 * Math.PI * radius);

        System.out.println("Your perimeter is "+circumference);
    }
}