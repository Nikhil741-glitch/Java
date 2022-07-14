public class stockBuySell2 {
    
    public static void main(String[] args) {
        int a[] = {100, 180, 260, 310, 40, 535, 695};
        int min = a[0];
        int i, j = 0;
        int max = 0;
        int profit = 0;
        for(i = 1; i < a.length; i++) {
            if(min > a[i]) {
                min = a[i];
            }
            if(min < a[i]) {
                for(j = i+1 ; j < a.length; j++) {
                    if(a[i] < a[j]) {
                        max = a[j];
                    }
                    else {
                        break;
                    }
                }
            }
            if((max - min) > profit) {
                profit = max - min;
                System.out.println("Profit is : " + profit);
                System.out.println("(" + (i-1) + " " + (j-1) + ")");
            }
            min = a[j];
            i = j;
            //profit = max - min;
            //loss = j - 1;
            //System.out.println("Profit is : " + profit);
        }
    }
}
