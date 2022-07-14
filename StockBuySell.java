public class StockBuySell {
    static int Stock(int a[]) {
        int maxProfit = 0;
        int minSoFar = a[0];
        for(int i = 0; i < a.length; i++) {
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int a[] = {5,2,2,1,3};
        int result = Stock(a);
        System.out.println("Max Profit is : " + result);
    }
}
