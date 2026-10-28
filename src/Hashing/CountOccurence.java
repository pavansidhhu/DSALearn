package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurence {
    public static void main(String[] args) {
        int a[]={1,2,1,3,2};
        MapCal(a);
        for(int i=0;i<a.length;i++){
            boolean bh=true;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    bh=false;
                    break;
                }
            }
            if(bh) {
                System.out.println(a[i] + " :: "  );//RepeatOccurence(a[i], a));
            }
        }
    }

    public static void MapCal(int a[]){
        Map<Integer,Integer> m1= new TreeMap<>();
      //m1.getOrDefault(a,null);
        for(int i=0;i<a.length;i++){
            m1.put(a[i], m1.getOrDefault(a[i],0)+1);
        }
       // System.out.println("Map :: ")

        System.out.println(m1);
    }



    public static int RepeatOccurence(int n,int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(n==a[i]){
                count++;
            }
        }
        return count;
    }
}
