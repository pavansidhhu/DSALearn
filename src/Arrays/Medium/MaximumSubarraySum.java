package Arrays.Medium;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[]={2, 3, -10, 5, 4};
        int sum=arr[0];
        int cur=arr[0];
        for(int i=0;i<arr.length;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            sum=Math.max(cur,sum);
        }
        System.out.println(sum);
    }
}
