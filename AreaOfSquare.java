// Write a java program to find the area of Square;

import java.util.Scanner;
class AreaOfSquare{
    public static void main(String[] args) {
        double side;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side :-");
        side = sc.nextDouble();

        // Based on formula
        double area = side * side;
        System.out.println("AREA OF A SQUARE IS :- " + area);
    }
}