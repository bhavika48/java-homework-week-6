/*Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme. */


public class Programme1 {
    //creating instance variable
    int a = 2;
    int b = 4;

    //instance method
    void add() {
        System.out.println(a + b); //print statement
    }

    public static void main(String[] args) { //main method
        Programme1 pro = new Programme1();
        pro.add();//instance method in main method
    }
}
