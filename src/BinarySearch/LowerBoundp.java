package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LowerBoundp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();

        }
        Arrays.sort(arr);
        int k= sc.nextInt();
        int low=0;
        int high= arr.length-1;
        //12 3 5 6 67  6
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k) {
              ans=mid;
              high=mid-1;
            }
             else{
                low=mid+1;

            }

        }
        System.out.println(ans);
    }
}
