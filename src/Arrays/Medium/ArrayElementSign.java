package Arrays.Medium;

import java.util.*;

public class ArrayElementSign {
    public static void main(String[] args) {
        int arr[]={-4, 4, -4, 4, -4, 4  };
        List<Integer> ev=new ArrayList<>();
        List<Integer> ov=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ev.add(arr[i]);
            }
            if(arr[i]<0){
                ov.add(arr[i]);
            }
        }
        int k=0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(ev.get(k)+" ");
                k++;
            }
            else{
                System.out.print(ov.get(l)+" ");
                l++;
            }
        }

    }
}
