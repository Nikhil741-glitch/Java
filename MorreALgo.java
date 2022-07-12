import java.util.*;
public class MorreALgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int n = s.nextInt();
        int []a = new int[n];
        System.out.println("Please Enter elements of an Array : ");
        for(int i = 0; i < n ; i++) {
            a[i] = s.nextInt();
        }
        int index = 0;
        int count = 1;
        int counte = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] == a[index]){
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                index = i;
                count = 1;
            }
        }
        for(int j = 0; j < n; j++) {
            if(a[index] == a[j]) {
                counte++;
            }
        }
        System.out.println(counte);
        if(counte > (n/2)) {
            System.out.println("Majority Element is : ");
            System.out.println(a[index]);         
        } else {
            System.out.println("No majority Element Present . ");
        }
        s.close();
    }
}
