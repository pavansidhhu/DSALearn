package Arrays.Easy;

import java.util.Arrays;

public class RotatingKElements {
    public static void main(String[] args) {
        int a[]={12,2,3,4,5,6};
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        Arrays.stream(a).forEach(System.out::println);
    }
}
