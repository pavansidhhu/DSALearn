package Arrays.Easy;

import java.util.Map;
import java.util.TreeMap;

public class MajarotiyElement {
    public static void main(String[] args) {
        int a[]={2,3,4,5,4,3,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4};
        Map<Integer,Integer> m1= new TreeMap<>();
        for(int i=0;i<a.length;i++){
            m1.put(a[i], m1.getOrDefault(a[i],0)+1);


        }
        for(Map.Entry<Integer,Integer> en:m1.entrySet()){
            if(en.getValue()>(a.length/2)){
                System.out.println(en.getKey());
            }
        }

       // System.out.println(m1);

       // System.out.println(m1.keySet());
       // System.out.println(m1.get(m1.size()));
    }
}
