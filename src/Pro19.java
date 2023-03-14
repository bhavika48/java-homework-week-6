/*Write a Java program to convert a given string into lowercase.
        Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        Output: the quick brown fox jumps over the lazy dog.*/

import java.util.Scanner;

public class Pro19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String a = scan.nextLine();
        String result = a.toLowerCase();
        System.out.println("Output: " + result);
        scan.close();

    }
}
