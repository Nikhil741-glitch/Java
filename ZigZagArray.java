public class ZigZagArray {
    public static void main(String[] args) {
        int a[] = {4, 3, 7, 8, 6, 2, 1};
        int n = a.length;
        int i,temp;
        for(i = 0; i < n-2; i += 2) {
            if(a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
                if(a[i+1] < a[i+2]){
                    temp = a[i+1];
                    a[i+1] = a[i+2];
                    a[i+2] = temp;
                }
            }
            if(n%2 == 0 && a[n-2] > a[n-1]) {
                temp = a[n-2];
                a[n-2] = a[n-1];
                a[n-1] = temp;
            }
            for(i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        }
    }

