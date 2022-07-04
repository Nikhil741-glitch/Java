import java.util.Scanner;
public class BinarySearch {
   static int binary(int a[], int l, int r, int x) {
       if (r >= l) {
           int mid = l + (r - l) / 2;
           if (a[mid] == x){
            return mid;
           } 
           if (a[mid] > x) {
            return binary(a, l, mid - 1, x);
           }
           return binary(a, mid + 1 , r, x);
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int n = s.nextInt();
        int []a = new int[n];
        System.out.println("Please Enter elements of an Array : ");
        for(int i = 0; i < n ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter Element to be find : ");
        int x = s.nextInt();
        int result = binary(a, 0, n-1, x);
        if(result == -1) {
            System.out.println("Element not Present . ");
        }
        else {
            System.out.println("Element found at Index " + result);
        }
        s.close();
    }
}
