package Arrays.Easy;

import java.util.Scanner;

public class LongestSubarrayK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={6, -2, 2, -8, 1, 7, 4, -10};
        int count=0;
        int max=0;
        for(int i=0;i< arr.length;i++){
            int add=arr[i];
            count=0;
           for( int j=i+1;j<arr.length;j++){
               add=add+arr[j];
               count++;
               if(add==0){
                   max=Math.max(max,count);

               }

            }

        }
        System.out.println(max+1);
    }
}
