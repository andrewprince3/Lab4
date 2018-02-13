import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        int carMpg = 0;
        double tankCap = 0;
        double tankFilled = 0;
        double rawRange;

        System.out.print("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        carMpg = scnr.nextInt();
        System.out.println();

        if (carMpg <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }

        System.out.print("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCap = scnr.nextDouble();
        System.out.println();

        if (tankCap <= 0) {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }

        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        tankFilled = scnr.nextDouble();
        System.out.println();

        if (tankFilled < 0 || tankFilled > 100) {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }

        rawRange = carMpg * tankCap * (tankFilled * 0.01);

        if (rawRange <= 25) {
            System.out.print("Attention! Your current estimated range is running low: " + (int)rawRange + " miles left!!!");
        }
        if (rawRange > 25) {
            System.out.print("Keep driving! Your current estimated range is: " + (int)rawRange + " miles!");
        }



    }
}
