import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, base;
        System.out.println("Enter the height of the Traingle:-");
        height = sc.nextInt();
        System.out.println("Enter the base of the Traingle:-");
        base = sc.nextInt();

        double area = (height * base)/2;
        System.out.println(area);

    }
}