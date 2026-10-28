package Arrays.Medium;

import java.util.*;

public class StockBuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={7,6,4,3,1};
//Arrays.sort(arr);
       // List<Integer> l1=new ArrayList<>();
        int maxp=0;
        for(int i=0;i<arr.length;i++){
            int buy=arr[i];

            for(int j=i+1;j<arr.length;j++){
              int prof=arr[j]-buy;

              maxp=Math.max(maxp,prof);
            }
        }

        System.out.println(maxp);
        


    }
}
