import java.util.Scanner;

// simple calculator.

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Please choose your option");
            System.out.println("(0). exit(0)\n(1). Addition\n(2). Substraction\n(3). Multiplication\n(4). Division\n");

            System.out.println("Enter your choice.");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the first integer:-");
                    int a = sc.nextInt();
                
                    System.out.println("Enter the second integer:-");
                    int b = sc.nextInt();

                    int result1 = addition(a,b);
                    System.out.println("The sum of two number is "+result1);
                    break;
                
                case 2:
                    System.out.println("Enter the first integer:-");
                    int c = sc.nextInt();
            
                    System.out.println("Enter the second integer:-");
                    int d = sc.nextInt();

                    int result2 = substraction(c, d);
                    System.out.println("The subtraction of two number is "+result2);
                    break;

                case 3:
                    System.out.println("Enter the first integer:-");
                    int e = sc.nextInt();
            
                    System.out.println("Enter the second integer:-");
                    int f = sc.nextInt();

                    int result3 = multiplication(e,f);
                    System.out.println("The multiplication of two number is "+result3);
                    break;

                case 4:
                    System.out.println("Enter the first integer:-");
                    int g = sc.nextInt();
            
                    System.out.println("Enter the second integer:-");
                    int h = sc.nextInt();

                    int result4 = division(g,h);
                    System.out.println("The division of two number is "+result4);
                    break;
                
                case 0 :
                    System.exit(0);
                    break;
                
                default :
                    System.out.println("You have choosen wrong choice.");
                    break;

            }
        }
    }

    public static int addition(int a, int b){
        int result = a+b;
        return result;
    }
    public static int substraction(int a, int b){
        int result = a-b;
        return result;
    }
    public static int multiplication(int a, int b){
        int result = a*b;
        return result;
    }
    public static int division(int a, int b){
        int result = a/b;
        return result;
    }
}