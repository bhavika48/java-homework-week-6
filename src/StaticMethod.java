/*3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.*/

public class StaticMethod {
    int x = 25;         //instance variable
    static int y = 20;  //static variable

    void minus() {      //instance method
        System.out.println("call instance method");
        System.out.println(x);
    }

    static void staticMinus() {            //static method
        System.out.println("call static method");
        System.out.println(y);
    }

    public static void main(String[] args) {
        StaticMethod.staticMinus(); //calling static  method into main method
        StaticMethod s = new StaticMethod(); //creating object to call instance method
        s.minus();       //  calling instance method into main method
    }
}
