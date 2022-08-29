public class ArrangingArray {
    public static void main(String[] args) {
        int a[] = {2, -4, 7, -3, 4};
        int n = a.length;
        int neg = 0;
        int pos = 0;
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] < 0) {
                a[index] = a[i];
                index++;
                neg++;
            }
            else {
                a[index] = a[i];
                index++;
                pos++;
            }
        }
        System.out.println(neg);
        System.out.println(pos);
    }
}
