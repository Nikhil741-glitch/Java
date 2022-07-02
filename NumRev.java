import java.util.*;
public class NumRev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array :: ");
		int size = s.nextInt();
		int A[] = new int[size];
        System.out.println("Enter elements of the Array A[] : ");
		for(int i = 0; i<A.length; i++) {
		    A[i] = s.nextInt();
		}
        System.out.println("Reverse of the Array is :: ");
		for(int j = A.length-1; j >=0; j--){
		    System.out.println(A[j]);
		}
        s.close();
    }
}
/*import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int A[] = new int[size];
		for(int i = 0; i<A.length; i++) {
		    A[i] = s.nextInt();
		}
		int temp;
        int start=0;
        int end=A.length-1;
        while (start < end)
        {
            temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
		for(int i = 0; i <A.length; i++){
		    System.out.print(A[i] + " ");
          
         System.out.println();
		}
	}
}*/