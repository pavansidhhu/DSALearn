package SirClass;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={23,12,45,1,2,4,10};
        int tr=sc.nextInt();
        Arrays.sort(a);
        int low=0;
        int high=a.length-1;

        boolean bh=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(tr==a[mid]){
                bh=true;
                break;
            }
            else if(tr>a[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }


        }
        if(bh){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }


    }
}
