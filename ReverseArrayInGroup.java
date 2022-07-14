public class ReverseArrayInGroup {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int n = a.length;
        int k = 4,x,y,c,d;
        for(int i = 0; i < n; i++) {
            if(i == (k-1)) {
                x = 0;
                y = k-1;
                for(int j = 0; j < k; j++) {
                    if(x == y) {
                        break;
                    }
                    else {
                        a[x] = a[x] + a[y];
                        a[y] = a[x] - a[y];
                        a[x] = a[x] - a[y];
                        x++;
                        y--;
                    }
                }
            }
            if(i >= k) {
                c = k;
                d = n-1;
                for(int j = k; j < n; j++) {
                    if(c == d) {
                        break;
                    }
                    else {
                        a[c] = a[c] + a[d];
                        a[d] = a[c] - a[d];
                        a[c] = a[c] - a[d];
                        c++;
                        d--;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}

/*
 * class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
         for(int i=0;i<n;i+=k)
       {
           int left=i;
           int right=Math.min(i+k-1,n-1);
           while(left<right)
           {
               Collections.swap(arr,left,right);
               left++;
               right--;
           }
       }
        
    }
}

 */
