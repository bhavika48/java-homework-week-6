/*2.1 Declare two static variables
        2.2 Declare one static method
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and Run the programme.*/

public class StaticVariables {
    static int num = 10; // static variable
    static int num1 = 20;

    static void display() { // static method
        System.out.println(num + num1); //call static variable
    }

    public static void main(String[] args) {
        StaticVariables.display(); // static method into main method
    }
}
