package Arrays.Easy;

import java.util.Arrays;

public class LargestNo {
    public static void main(String[] args) {
        int a[]={23,45,65,32,45,90,76,50,65};
       WithoutSort(a);
       WithSorting(a);
    }
    public static void  WithoutSort(int a[] ){
        int max=0;
        for(int i=0;i<a.length;i++){
          if(a[i]>max){
              max=a[i];
          }
        }
        System.out.println(max);
    }
    public static void WithSorting(int a[]){
        Arrays.sort(a);
        System.out.println(a[a.length-1]);

    }
}
