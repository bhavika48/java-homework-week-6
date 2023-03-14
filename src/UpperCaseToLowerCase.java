/*Write a program to convert the upper case to lower case.*/

import java.util.Scanner;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");
        String a = scan.next();
        String result = a.toLowerCase();
        System.out.println(result);
        scan.close();
    }
}
