package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();

        }
        int i=0;
        int j=0;
        List<Integer> l1=new ArrayList<>();
        // 1 2 3 4
        // 2 3 5 6
        while(i<n && j<m){
            if(arr[i]<arr1[j]){
                if(l1.isEmpty() || l1.get(l1.size()-1)!=arr[i]){
                    l1.add(arr[i]);
                }
                i++;
            }
            else if(arr[i]>arr1[j]){
                if(l1.isEmpty() || l1.get(l1.size()-1)!=arr1[j]){
                    l1.add(arr1[j]);
                }
                j++;
            }
            else{
                if(l1.isEmpty() || l1.get(l1.size()-1)!=arr[i]){
                    l1.add(arr[i]);
                }
                i++;
                j++;
            }

        }
        while(i<n){
            if(l1.isEmpty()|| l1.get(l1.size()-1)!=arr[i]){
                l1.add(arr[i]);

            }
            i++;
        }
        while(j<m){
            if(l1.isEmpty()|| l1.get(l1.size()-1)!=arr1[j]){
                l1.add(arr1[j]);

            }
            j++;
        }
        for(int lo:l1){
            System.out.print(lo+" ");
        }
    }
}
