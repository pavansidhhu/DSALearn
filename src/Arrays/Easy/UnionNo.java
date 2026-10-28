package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionNo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arr1[]={2,3,4,4,5,11,12};
        int n= arr.length;
        int m= arr1.length;
        List<Integer> l1=new ArrayList<>();
        int i = 0,j=0;

        while(i <n && j<m){
            if(arr[i]<arr[j]){
                if(l1.isEmpty()||l1.getFirst()!=arr[i]) {
                    l1.add(arr[i]);
                }
                i++;
            }
            else if(arr[j]<arr[i]){
                if(l1.isEmpty()||l1.getFirst()!=arr[j]){
                    l1.add(arr[j]);
                }
                j++;
            }
            else{
                if(l1.isEmpty()||l1.getFirst()!=arr[i]){
                    l1.add(arr[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(l1.isEmpty()||l1.getFirst()!=arr[i]) {
                l1.add(arr[i]);
            }
            i++;
        }
        while(j<m){
            if(l1.isEmpty()||l1.getFirst()==arr[j]) {
                l1.add(arr[j]);
            }
            j++;
        }
        l1.stream().forEach(System.out::print);
    }
}
