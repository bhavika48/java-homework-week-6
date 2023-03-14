/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Input a number : ");
        int c = sca.nextInt();

        System.out.println(c + " x " + "1" + " = " + c * 1);
        System.out.println(c + " x " + "2" + " = " + c * 2);
        System.out.println(c + " x " + "3" + " = " + c * 3);
        System.out.println(c + " x " + "4" + " = " + c * 4);
        System.out.println(c + " x " + "5" + " = " + c * 5);
        System.out.println(c + " x " + "6" + " = " + c * 6);
        System.out.println(c + " x " + "7" + " = " + c * 7);
        System.out.println(c + " x " + "8" + " = " + c * 8);
        System.out.println(c + " x " + "9" + " = " + c * 9);
        System.out.println(c + " x " + "10" + " = " + c * 10);
        sca.close();
    }
}

