/*Write a program to calculate the area of a triangle*/

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in); // created an object
        System.out.println("Enter base of triangle : ");
        double b = sca.nextDouble();

        System.out.println("Enter Vertical height of triangle : ");
        double h = sca.nextDouble();

        double area = b * h / 2;
        System.out.println("Area of triangle : " + area);

        sca.close();

    }
}
