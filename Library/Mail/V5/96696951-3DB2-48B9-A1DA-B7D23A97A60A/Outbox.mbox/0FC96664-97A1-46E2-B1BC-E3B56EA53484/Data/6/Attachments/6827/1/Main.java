import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String number = scnr.next();
        number = number.toUpperCase();
        if (number.contains("0X")) {
            number = number.substring(2);
        }

        int i = 0;
        long totalValue = 0;

        while(i < number.length()){
            double value;
            switch(number.charAt(i)){
                case 'A':
                    value = 10;
                    break;
                case 'B':
                    value = 11;
                    break;
                case 'C':
                    value = 12;
                    break;
                case 'D':
                    value = 13;
                    break;
                case 'E':
                    value = 14;
                    break;
                case 'F':
                    value = 15;
                    break;
                case 'G':
                    value = 16;
                    break;
                default:
                    value = ((int)number.charAt(i) - 48);
                    break;
            }
            totalValue += Math.pow(16, number.length() - (i + 1)) * value;
            i++;
        }
        System.out.println("Your number is " + totalValue + " in decimal");
    }
}