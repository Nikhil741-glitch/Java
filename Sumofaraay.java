import java.util.Scanner;
import java.util.Arrays;
class array{
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int A[] = new int[size];
        int sum=0;
        System.out.println("Enter elements of the Array A[] : ");
        for(int i=0; i<A.length;i++){
            A[i] = s.nextInt();
            sum = sum + A[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(A));
        System.out.println("Sum of the elements of the array ::"+sum);
        s.close();
    }
}