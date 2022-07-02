import java.util.Scanner;
import java.lang.ArithmeticException;
public class Exception {
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a : ");
        a = s.nextInt();
        System.out.println("Please enter b : ");
        b = s.nextInt();
        try {
            System.out.println(a + " divide by " + b + " = " + a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(a + " can not be divided by " + b);
            e.printStackTrace();
        }
        s.close();
    }
}
