// write a Java Program to find area of equilateral triangle.
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side;
        System.out.println("Enter the height of the Traingle:-");
        side = sc.nextFloat();

        double area = (Math.sqrt(3))/4*side*side;
        System.out.println(area);

    }
}