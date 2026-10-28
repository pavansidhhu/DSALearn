package Arrays.Medium;

public class StockBrute {
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
        int max=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                  int a=arr[j]-arr[i];

                   // System.out.println(arr[i]+"-"+arr[j]+"="+a);
                    max=Math.max(max,a);

            }
        }
        System.out.println(max);

    }
}
