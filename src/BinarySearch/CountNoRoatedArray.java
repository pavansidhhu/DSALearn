package BinarySearch;

import java.util.Arrays;

public class CountNoRoatedArray {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        //1 2 3 4 5
        int a[]= Arrays.copyOf(arr,arr.length);
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
