package Arrays.Medium;

public class Leader {
    public static void main(String[] args) {
        int arr[]={-3, 4, 5, 1, -4, -5};
        boolean bh=false;
        for(int i=0;i<arr.length;i++){
            bh=true;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    bh=false;
                    break;
                }
                bh=true;
            }
            if(bh) {
                System.out.println(arr[i]);
            }
        }
    }
}
