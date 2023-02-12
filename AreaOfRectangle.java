// Write a java program to find the area of Rectangle;
import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String[] args) {
        double length, width;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length :-");
        length = sc.nextDouble();
        System.out.println("Enter the width :-");
        width = sc.nextDouble();

        // Based on formula
        double area = length * width;
        System.out.println("AREA OF A RECTANGLE IS :- " + area);
    }
}