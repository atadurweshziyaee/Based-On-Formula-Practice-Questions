import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side:-");
        double side = sc.nextDouble();

        double perimeter = (double) (4*side);

        System.out.println("Your perimeter is "+perimeter);
    }
}