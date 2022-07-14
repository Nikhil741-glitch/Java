public class SwapKthElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(i == (k-1)) {
                System.out.print(arr[n-k]  + " ");
            }
            else if(i == (n-k)) {
                System.out.print(arr[k-1]+ " ");
            }
            else {
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
