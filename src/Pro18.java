/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Input first a number : ");
        int c = sca.nextInt();
        System.out.print("Input second number : ");
        int d = sca.nextInt();
        // System.out.println(c + " x " + "10" + " = " + c * 10);

        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " x " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(c + " mod " + d + " = " + (c % d));
        sca.close();

    }
}
