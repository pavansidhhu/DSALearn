package TcsNQT;

import java.util.Arrays;

public class ReverseNo {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int start=0;
        int end=a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        Arrays.stream(a).forEach(System.out::print);
    }
}
