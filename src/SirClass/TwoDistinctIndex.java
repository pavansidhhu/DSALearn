package SirClass;

import java.util.Arrays;

public class TwoDistinctIndex {
    public static void main(String[] args) {
        int arr[]={1,0,1,1};
        int k=1;
        boolean bh=false;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(Math.abs(i-j)<=k)){
                   // System.out.println(Math.abs(i-j)+" "+arr[i]+" "+arr[j]);
                    bh=true;
                    count++;
                    break;
                }
            }
            if(count!=0){
                break;
            }
        }
        System.out.println(bh);
    }
}
