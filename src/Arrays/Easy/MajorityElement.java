package Arrays.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        int k= arr.length/2;
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        for(int a:arr){
            m1.put(a,m1.getOrDefault(a,0)+1);

        }
        int ll=0;
        for(Map.Entry<Integer,Integer> m:m1.entrySet()){
            int k1=m.getKey();
            int v=m.getValue();
            if(v>=k){
                ll=k1;
            }
        }
        System.out.println(ll);
    }
}
