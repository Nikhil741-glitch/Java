import java.util.Scanner;
import java.util.Arrays;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array :: ");
        int size = s.nextInt();
        int A[] = new int[size];
        System.out.println("Enter elements of the Array A[] : ");
        for(int i=0; i<A.length;i++){
            A[i] = s.nextInt();
        }
        System.out.println("Elements of the array are: "+Arrays.toString(A));
        int neg = 0;
        int pos = 0;
        for(int i=0;i < A.length;i++){
            if(A[i] < 0){
                neg++;
            }
            if(A[i] > 0) {
                pos++;
            }
        }
        System.out.println("Number of Negative numbers are : " + neg);
        System.out.println("Number of Positive numbers are : " + pos);
        s.close();
    }
}
