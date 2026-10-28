package Matrix;

public class DiagonalElement {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        for(int i=0;i<2*(n-1);i++){
            for(int j=0;j<n;j++){
                int k=i-j;
                if((k>=0)&&(k<arr.length)){
                    int kk=arr[j][k];
                    System.out.print(arr[j][k]+" ");
                }
            }

        }
    }
}
