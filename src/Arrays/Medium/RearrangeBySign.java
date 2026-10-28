package Arrays.Medium;

import java.util.ArrayList;
import java.util.*;

public class RearrangeBySign {
    public static void main(String[] args) {
        int a[]={1,2,-3,-1,-2,-3};
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}
