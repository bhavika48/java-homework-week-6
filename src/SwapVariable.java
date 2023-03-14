/*Write a Java program to swap two variable*/

public class SwapVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
