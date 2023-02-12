// Write a java program to find the area of circle;
import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        // a = pi * r^2;
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("AREA OF A CIRCLE IS :- "+ area);
    }
}