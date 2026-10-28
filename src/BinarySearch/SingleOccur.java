package BinarySearch;

import java.util.LinkedHashMap;
import java.util.Map;

public class SingleOccur {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,5,5,6,6};
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        for(int a1:a){
            m1.put(a1,m1.getOrDefault(a1,0)+1);
        }
       for(Map.Entry<Integer,Integer> k:m1.entrySet()){
           if(k.getValue()==1){
               System.out.println(k.getKey());
           }
       }
    }
}
