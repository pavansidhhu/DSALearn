package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionNoinTwoArrays {
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 3, 4};
        int arr1[]={2, 2, 4, 6};
        int i=0;
        int j=0;
        List<Integer> l1=new ArrayList<>();
        while(i<arr.length && j< arr1.length){
            if(arr[i]<arr1[j]){
                i++;
            }
            else if(arr[i]>arr1[j]){
                j++;
            }
            else{
                if (l1.isEmpty() || l1.contains(arr[i])) {
                    l1.add(arr[i]);
                }
                 i++;
                 j++;
            }
        }

        l1.stream().forEach(System.out::print);
    }
}
