/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String first = scn.next();

        System.out.print("Input second binary number: ");
        String second = scn.next();

        String result = add(first, second);
        System.out.println("Sum of two binary numbers: " + result);
        scn.close();
    }

    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
