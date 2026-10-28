package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={20,34,21,44,55};
        Arrays.sort(a);
        /*for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
       Arrays.stream(a).forEach(System.out::println)*/;
        int t=sc.nextInt();//44
        boolean b=false;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(t==a[mid]){
                b=true;
                break;
            }
            else if(t>a[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(b){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}

