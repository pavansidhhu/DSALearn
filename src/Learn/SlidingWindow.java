package Learn;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,4,5,6};
        int k=2;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum^arr[i];
        }
        int max=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum^arr[i-k]^arr[i];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
