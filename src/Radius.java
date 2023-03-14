/*Write a program to enter any radius value of the circle and find out the
        area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

import static java.lang.Math.PI;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating an object
        double c = input.nextDouble();
        System.out.println(c);
        double result = PI * c * c;
        System.out.println(result);
        input.close();
    }
}
