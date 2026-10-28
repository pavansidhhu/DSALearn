package Arrays.Medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MajarotiyElementsII {
    public static void main(String[] args) {
        int arr[]={1, 2, 1, 1, 3, 2, 2};
        List<Integer> l1=new ArrayList<>();
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        int h= arr.length/3;
        for(int a:arr){
            m1.put(a,m1.getOrDefault(a,0)+1);

        }
        for(Map.Entry<Integer,Integer> en:m1.entrySet()){
            int k=en.getKey();
            int v= en.getValue();
            if(v>h){
                l1.add(k);
            }
        }
        System.out.println(l1);
       // System.out.println(0);
    }
}
