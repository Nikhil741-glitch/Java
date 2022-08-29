import java.util.ArrayList;
import java.util.Arrays;

public class SumPair {
    public static void main(String[] args) {
        int a[] = {4,3,1,0,2};
        int n = a.length,sum1  = 0, sum = 0, x = 54,m;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    sum = a[i] + a[j];
                    sum1 = a[j] + a[k];
                    //m = x-sum;
                    arr.add(sum);
                    arr1.add(sum1);
                
                }
            }
        }

        System.out.println(arr);
        System.out.println(arr1);        
    }
}
