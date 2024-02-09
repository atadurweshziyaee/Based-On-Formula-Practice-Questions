import java.util.Scanner;

public class Table
{
   public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of whatever multiplication table you want.");
        int num = sc.nextInt();
        System.out.println("\n---Multiplication Table of 2---");
      
        for(int i=1; i<=10; i++)
            System.out.println(num+" X "+i+" = "+num*i);
   }
}