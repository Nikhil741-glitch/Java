public class CountPairOFSum {
    public static void main(String[] args) {
        int n = 4, k = 2,count = 0;;
        int arr[] = {1, 1, 1, 1};
        for(int i = 0; i < n; i++) {
            int m = arr[i];
            for(int j = i+1; j < n; j++) {
                if(m + arr[j] == k) {
                    count++;
                }
            }
        }
        if(count != 0) {
            System.out.println(count);
        }
    }
}
