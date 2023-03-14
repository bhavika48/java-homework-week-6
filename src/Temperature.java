/*Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // created an object
        double f = scan.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(c);
        scan.close();
    }
}
