public class CyclicRotate {
    public static void main(String[] args) {
        int a[] = {9, 8, 7, 6, 4, 2, 6, 3};
        int n = a.length;
        int x = 6;
        /*for(int i = 0; i > n; i++) {
            if(i == 0)) {
                a[0] = a[n-1];
                System.out.print(a[0]);
            } 
            else {
                a[i+1] = a[i];
                System.out.print(a[i]);
            }
        }*/
        int arr[] = {-1, -1};
        for(int i = 0; i < n; i++) {
            if(a[i] == x) {
                arr[0] = i;
                break;
            }
        }
        for(int i = n-1; i > 0; i--) {
            if(a[i] == x) {
                arr[1] = i;
                break;
            }
        }
        System.out.print(arr[0] + " " + arr[1]);
    }
}
