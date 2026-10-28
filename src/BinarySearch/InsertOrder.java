package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertOrder {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>(Arrays.asList(1,2,4,7));
        int a=2;
        l1.add(a);
        Collections.sort(l1);
        int j=0;
        for(int i=0;i<l1.size()-1;i++){
            if(a==l1.get(i)){
                j=i;
                break;
            }
        }
        System.out.println(j);

    }
}
