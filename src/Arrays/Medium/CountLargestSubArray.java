package Arrays.Medium;

import java.util.Scanner;

public class CountLargestSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<a;i++){
            sum=0;
            for(int j=i;j<a;j++){
                sum=sum+arr[j];
                if(sum<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else if(sum>k){
                    break;
                }
            }
        }
        System.out.println(maxlen);
    }
}
