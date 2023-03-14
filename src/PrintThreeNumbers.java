import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class PrintThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scan.nextInt();


        System.out.println("Enter second number");
        int y = scan.nextInt();

        System.out.println("Enter third number");
        int z = scan.nextInt();
        int result = (x + y + z) / 3;
        System.out.println("Average number :" + result);
        scan.close();


    }
}
