import java.util.Scanner;
import java.util.Arrays;
public class Min_Max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the required size of the array :: ");
        int size = s.nextInt();
        int A[] = new int[size];
        System.out.println("Enter elements of the Array A[] : ");
        for(int i=0; i<A.length;i++){
            A[i] = s.nextInt();
        }
        System.out.println("Elements of the array are: "+Arrays.toString(A));
        /*int min = A[0];
        int max = 0;
        for(int i = 0; i<A.length;i++) {
            if(min > A[i]){
                 min = A[i];
            }
            if(max < A[i]){
                max = A[i];
            }
        }
        System.out.println("Minimum value is : "+ min);
        System.out.println("Maximum value is : "+ max);*/
        int minimum = Integer.MAX_VALUE;
        System.out.println(minimum);
        s.close();
    }
}
