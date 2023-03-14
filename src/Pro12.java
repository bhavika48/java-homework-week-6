import java.util.Scanner;

/*
Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Pro12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double a = 25.5;
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        //double b = 3.5;
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        // double c = 40.5;
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        // double d = 4.5;
        System.out.println("Enter d: ");
        double d = scanner.nextDouble();

        double result = ((a * b - b * b) / (c - d));
        System.out.println(result);
        scanner.close();


    }

}
