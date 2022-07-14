public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {1, 7, 4, 3, 4, 8, 7};
        int n = 7;
        /*int m = a[0] ,i,j,b,c = a[0];
        for(i = 0; i < a.length; i++) {
            if(a[i] > m) {
                m = a[i];
            }
        }
        b = m;
        System.out.println(b);
        
        for(j = 0; j < a.length-1; j++) {
            if(a[j] == b) {
                continue;
            }
            else if (a[j] > c ) {
                c = a[j];
            }
        }
        System.out.println(c);*/
        int m = 0;
        int count = 0;
        int k = 2;
        for(int i = 0; i < n;i++) {
             m = a[i];
             for(int j = i + 1 ; j < n; j++) {
                 if(m == a[j]) {
                     count++;
                 }
                 if(count > k) {
                    break;
                }
            }
        }
        System.out.println(m);
    }
}
