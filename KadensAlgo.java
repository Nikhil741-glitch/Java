import java.util.Scanner;

public class KadensAlgo {
    static int maxSubarray(int a[]) {
        int maxSum = 0;
        int curSum = 0;
        int Cneg = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                Cneg++;
            }
            max = Math.max(a[i], max);
            curSum = curSum + a[i];
            if(curSum > maxSum) {
                maxSum = curSum;
            }
            if(curSum < 0) {
                curSum = 0;
            }
        }
        if(Cneg == a.length){
            maxSum = max;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lenght of the Array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements of the Array : ");
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int result = maxSubarray(a);
        System.out.println("Maximum Sum is : " + result);
        s.close();
    }
}
