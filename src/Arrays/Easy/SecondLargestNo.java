package Arrays.Easy;

import java.util.Arrays;

public class SecondLargestNo {
    public static void main(String[] args) {
        int a[]={23,45,65,32,45,90,90,76,50,6};
        WithoutSort(a);
        WithSorting(a);
    }
    public static void  WithoutSort(int a[] ){
      int largest=a[0];
      int secl=-1;
      int smallest=a[0];
      int ssmallest=Integer.MAX_VALUE;
      for(int i=1;i<a.length;i++){
         if(a[i]>largest){
             secl=largest;
             largest=a[i];
         }
         else if(a[i]< largest && a[i] > secl){
             secl=a[i];
         }
         if(a[i]<smallest){
             ssmallest=smallest;
             smallest=a[i];
         }
         else if(a[i]!=smallest && a[i]<ssmallest ){
           ssmallest=a[i];
         }
      }
        System.out.println("Largest :: "+ largest);
        System.out.println("SecondLargest ::"+ secl);
        System.out.println("Smallest ::"+smallest);
        System.out.println("SecondSmallest ::"+ssmallest);
    }





    public static void WithSorting(int a[]){
        Arrays.sort(a);
        int arr[]= Arrays.stream(a)
                .distinct()
                .toArray();
        System.out.println("Largest :: "+arr[arr.length-1]);
        System.out.println("SecondLargest"+arr[arr.length-2]);
        System.out.println("2nd Samllest :: "+arr[1] );
       // System.out.println(arr[arr.length-2]);

    }
}
