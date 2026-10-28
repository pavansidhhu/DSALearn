package TcsNQT;

import java.util.HashMap;
import java.util.Map;

public class CountOccur {
    public static void main(String[] args) {
        int a[]={10,5,10,15,10,5};
        Map<Integer,Integer> m1=new HashMap<>();
        int keymax=Integer.MIN_VALUE;
        int val=Integer.MIN_VALUE;
        for(int a1:a){
            m1.put(a1,m1.getOrDefault(a1,0)+1);

        }
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            val=Math.max(val,entry.getValue());
            keymax= entry.getValue();
        }
      //  System.out.println(m1);

        System.out.println(val+"  "+keymax);
    }
}
