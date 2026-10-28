package BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int low=0;
        int high= arr.length-1;
        int ans= arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans
        );
    }
}
