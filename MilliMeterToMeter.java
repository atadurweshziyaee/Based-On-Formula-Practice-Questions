import java.util.Scanner;

public class MilliMeterToMeter{
    public static void main(String args[]){

        // taking input in millimeter.
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert millimeters to meters (mm to m). Enter:- ");
        double milliMeter = sc.nextDouble();

        //calling mmTom() method.
        double result = mmToM(milliMeter);
        System.out.println("========================================================");
        System.out.println("\n\n Millimeter \t\t\t: "+milliMeter+"\n           \t to");
        System.out.println("Meter           \t\t: "+result);
        System.out.println("========================================================");
    }

    // it will convert millimeter to meter.
    public static double mmToM(double millimeter){
        double meter = millimeter/1000.0d;
        return meter;
    }
}