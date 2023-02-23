// write a Java Program to find area of rhombus;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float diagonal1,diagonal2;
        System.out.println("Enter the first diagonal :-");
        diagonal1 = sc.nextFloat();
        System.out.println("Enter the second diagonal :-");
        diagonal2 = sc.nextFloat();

        double area = (diagonal1 * diagonal2)/2;
        System.out.println(area);

    }
}