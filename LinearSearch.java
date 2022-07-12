import java.util.Scanner;

//import java.util.Scanner;

public class LinearSearch {
    public static int search(int a[], int x) {
        int n = a.length;
        for(int i = 0; i<n; i++) {
            if(a[i] == x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.println("Enter the length of an Array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elemnets of an Array : ");
        for (int i = 0; i < n ; i++) {
            a[i] = s.nextInt();
        }*/
        int a[] = {1,2,3,4};
        System.out.println("Enter the elements to be find : ");
        int x = s.nextInt();
    int result = search(a , x);
    if(result == -1)
        System.out.println(" Element is not present in array");
    else 
        System.out.println("Element is present at index " + result);
    s.close();
    }
}
