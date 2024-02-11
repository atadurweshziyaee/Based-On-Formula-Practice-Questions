import java.util.Scanner;

public class MeterToMillimeter{
    public static void main(String args[]){

        // taking input in meter.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert meters to millimeter (mm to m). Enter:- ");
        double meter = sc.nextDouble();

        //calling mToMm() method.
        double result = mToMm(meter);
        System.out.println("========================================================");
        System.out.println("\n\n Meter \t\t\t: "+meter+"\n           \t to");
        System.out.println("Millimeter           \t\t: "+result);
        System.out.println("========================================================");
    }

    // it will convert meter to millimeter.
    public static double mToMm(double meter){
        double milliMeter = meter * 1000.0d;
        return milliMeter;
    }
}