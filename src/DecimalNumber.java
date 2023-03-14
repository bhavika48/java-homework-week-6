/*Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101*/

import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        double b = scan.nextDouble();

        String result = toBinary(b);
        System.out.println("Binary number is: " + result);
        scan.close();

    }

    public static String toBinary(double first) {
        int b1 = (int) first;
        return Integer.toBinaryString(b1);
    }
}
