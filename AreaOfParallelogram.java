
// write a Java Program to find area of parallelogram;
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, height;
        System.out.println("Enter the base :-");
        base = sc.nextFloat();
        System.out.println("Enter the height  :-");
        height = sc.nextFloat();

        double area = base * height;
        System.out.println(area);

    }
}