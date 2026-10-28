package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;
//100, 4, 200, 1, 3, 2


//4
public class LargestConse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   int a=sc.nextInt();
        int arr[]={100, 4, 200, 1, 3, 2};

        Arrays.sort(arr);
        //Arrays.stream(arr).forEach(System.out::println);
        int count=0;
        for(int i=0;i< arr.length-1;i++){
            //count++;
            if((arr[i]+1)!=arr[i+1]){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
