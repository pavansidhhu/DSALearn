package TcsNQT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AvgOfNo {
    public static void main(String[] args) {
        int a[]={1,2,1,1,5,1};
        double n=a.length*1.0;
        double avg1=(Arrays.stream(a).sum())/n;
      //  Object avg=
        System.out.format("%.1f",avg1);
       // System.out.println(Arrays.stream(a).average());
        //System.out.println(avg);
    }
}
