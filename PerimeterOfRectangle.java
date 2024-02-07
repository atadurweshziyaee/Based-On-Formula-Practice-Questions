import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:-");
        double len = sc.nextDouble();

        System.out.println("Enter the width:-");
        double width = sc.nextDouble();

        double perimeter = (double)2 * (len + width);

        System.out.println("Your perimeter is "+perimeter);
    }
}