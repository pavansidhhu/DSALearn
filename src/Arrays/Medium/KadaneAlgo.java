package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int a[]={-2, -3, -7, -2, -10, -4};


        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=-1;
        int end=0;
        for(int i=0;i<a.length;i++){
            if(max==0){
                start=i;

            }
            sum=sum+a[i];
            if(sum<0){
                max=0;
                sum=0;
            }
            if(max<sum){
               // sum=sum+a[i];
                max=sum;
              //  end=i;

            }
            System.out.println("start:: "+start+"end"+end);
        }
        System.out.println(max);

    }
}
