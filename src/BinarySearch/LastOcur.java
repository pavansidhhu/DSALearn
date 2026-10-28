package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LastOcur {
    public static void main(String[] args) {
        int arr[]={3, 4, 13, 13, 13, 20, 40};
        int tra=60;
        int low=0;
        int high=arr.length-1;

        int n=-1;
        Arrays.sort(arr);
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<tra) {
                n = mid;
                low=mid+1;
            }
            else if(arr[mid]<tra){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        System.out.println(n);
    }
}
