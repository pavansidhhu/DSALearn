package Arrays.Medium;

public class StockBruteON {
    public static void main(String[] args) {
        int arr[]={2,4,1};
        int min=Integer.MAX_VALUE      ;
        int in=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                in=i;
                min=arr[i];
            }

        }
        System.out.println(min);
        int max=0;
        for(int i=in;i<arr.length;i++){
            max=Math.max(max,arr[i]-min);
        }
        System.out.println(max);
    }
}
