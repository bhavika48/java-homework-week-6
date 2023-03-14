/*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods.)*/

import java.util.concurrent.Callable;

public class Calculator {
    public void addition(int a, int b) {    //instance method
        int ans = a + b;
        System.out.println("My first number" + " " + a);
        System.out.println("My second number" + " " + b);
        System.out.println("My result is " + "" + ans);

    }

    public void substraction(int x, int y) {           // instance method
        int ans = x - y;
        System.out.println("Enter first number:" + " " + x);
        System.out.println("Enter second number:" + " " + y);
        System.out.println("Result" + " " + ans);
    }
    static void multiplication(int c, int d) {          //static method
        int result = c * d;
        System.out.println("multiplication" + " " + c);
        System.out.println("with" + " " + d);
        System.out.println("my result:" + " " + result);

    }

    static void division(int salary, int salary1) {             //static method
        int result = salary / salary1;
        System.out.println("First:" + " " + salary);
        System.out.println("Second:" + " " + salary1);
        System.out.println("Answer is:" + " " + result);

    }

    public static void main(String[] args) {        // main method
        Calculator cal = new Calculator();
        cal.addition(5, 5);
        cal.substraction(40, 20);
        Calculator.division(2000, 1000);
        Calculator.multiplication(20, 30);
    }
}






