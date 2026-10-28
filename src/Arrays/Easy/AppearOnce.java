package Arrays.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class AppearOnce {
    public static void main(String[] args) {
        int arr[]={2,2,1};
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        for(int a:arr){
            m1.put(a,m1.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:m1.entrySet()){
            int k=m.getKey();
            int v=m.getValue();
            if(v==1){
                System.out.println(k);
                return;
            }
        }
        System.out.println(0);

    }
}
