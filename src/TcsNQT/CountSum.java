package TcsNQT;

import java.util.Arrays;

public class CountSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=Arrays.stream(a).sum();
       // if()
        System.out.println(Arrays.stream(a).sum());
    }
}
