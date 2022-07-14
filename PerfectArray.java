public class PerfectArray {
    public static void main(String[] args) {
        int a[] = {15, 20, 5, 6, 5, 6, 13, 4, 3, 4, 13, 6, 5, 6, 5, 20, 15};
        int first = 0;
        int n = a.length;
        int last = n-1;
        int count = 0;
        while(first != last) {
            if(a[first] == a[last]) {
                first++;
                last--;
                count++;
            }
            else {
                count = 0;
                break;
            }
        }
        if(n == 1) {
            System.out.println("PERFECT");    
        }
        if(count == 0)
        System.out.println("NOT PERFECT");
        else
        System.out.println("PERFECT");
    }
}
