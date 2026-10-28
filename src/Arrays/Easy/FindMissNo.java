package Arrays.Easy;

import java.util.Arrays;

public class FindMissNo {
    public static void findmis(int a[]){
        int n=a.length+1;
        int ep=n*(n+1)/2;
        int add=0;
        for(int a1:a){
            add=add+a1;
        }
        System.out.println(ep-add);
    }
    public static void dummpy(int arr[]){
        System.out.println("fjnnbornobnrnbrobn");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(arr[i]+" "+(arr[i]+1)+" ");
            }
        }
    }
    public static void main(String[] args) {
        //1 2 3 4 5 7 8
        int a[] = {1, 2, 3, 5};
        Arrays.sort(a);
        dummpy(a);
        System.out.println();
        findmis(a);


    }
}
