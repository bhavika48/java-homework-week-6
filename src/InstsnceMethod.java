/*4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme*/

public class InstsnceMethod {
    String name = "Prem";
    String lastname = "Patel"; // instance variables

    void print() {                              // instance method
        System.out.println(name + " " + lastname); //calling instance method

    }

    static int id = 5;
    static int salary = 1000;  // static variables

    static void addition() {             // static method
        System.out.println(id + salary); // calling static method

    }

    public static void main(String[] args) {
        InstsnceMethod inm = new InstsnceMethod(); // creating an object to call instance method
        inm.print();              // called instance method into main method
        InstsnceMethod.addition(); // called static method into main method
    }
}
