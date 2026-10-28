package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stock {
    public int maxProfit(int arr[], int k) {
        int n = arr.length;

        int hold = -arr[0]; // bought stock
        int cash = 0;       // no stock

        for (int i = 1; i < n; i++) {
            int prevCash = cash;

            cash = Math.max(cash, hold + arr[i] - k); // sell
            hold = Math.max(hold, prevCash - arr[i]); // buy
        }

        return cash;
    }

    public static void main(String[] args) {
        int a[]={6, 1, 7, 2, 8, 4};
        Stock s1=new Stock();
        System.out.println("o/p: "+(int)(s1.maxProfit(a,2)));
    }
}
