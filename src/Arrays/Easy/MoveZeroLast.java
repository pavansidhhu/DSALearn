package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroLast {
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        int arr[]=new int[a.length];
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) {
                arr[n] = a[i];
                n++;
            }
        }
        Arrays.stream(arr).forEach(e->System.out.print(e+" "));
    }
}
