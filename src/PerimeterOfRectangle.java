import java.util.Scanner;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width: ");
        double w = s.nextDouble();
        System.out.print("Enter Height: ");
        double h = s.nextDouble();
        double area = (w * h);
        System.out.println("Area is " + w + " * " + h + " = " + area);
        double perimeter = 2 * (w + h);
        System.out.println("Perimeter is 2 * (" + w + " + " + h + ") = " + perimeter);
        //                  Perimeter is 2 * (5.6 + 8.5) = 28.20
        s.close();


    }


}
