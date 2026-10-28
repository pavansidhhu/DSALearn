package Arrays.Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonReapeating {
    public static void main(String[] args) {
        int a[] = {4,1,2,1,2};
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++) {
            m1.put(a[i], m1.getOrDefault(a[i], 0)+1);
        }
        m1.entrySet().stream().filter(e->e.getValue()<=1).forEach(e->System.out.print(e.getKey()+" "));
        System.out.println(m1);
    }
}
