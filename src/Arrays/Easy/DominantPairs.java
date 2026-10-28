package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class DominantPairs {

    public static int dominantPairs(int[] arr) {
        // Code here
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int k=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i<=k-1){
                l1.add(arr[i]);


            }
            else{
                l2.add(arr[i]);

            }

        }

        int count=0;
        int i=0;
        int j=0;
        while(i<j){
            
        }
        /*for(int f:l1){
            for(int j:l2){
                if((5*j)<=f){

                    count++;
                }
            }

        }*/
        return count;
    }
    public static void main(String args[]){
        int arr[]={10, 2, 2, 1};
        int k = dominantPairs(arr);
       System.out.println(k);
    }
}

