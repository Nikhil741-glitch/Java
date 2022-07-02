import java.util.Scanner;

public class SwapTwoValue{
    public static void main(String[] args) {
       /* int a = 5;
        int b = 10;
        System.out.println("a = "+ a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+ a + " b = " + b);

        int a = 5;
        int b = 10;
        int temp;
        System.out.println("a = "+ a + " b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a + " b = " + b);*/

        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a :: ");
        int a = s.nextInt();
        System.out.println("Enter value of b :: ");
        int b = s.nextInt();
        System.out.println("a = "+ a + " b = " + b );
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap value of A and B ::");
        System.out.println("a = "+ a + " b = " + b);
        s.close();
    }
}

