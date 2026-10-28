package SirClass;

public class MoveZero {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int a[]=new int[arr.length];
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                a[n]=arr[i];
                n++;
            }

        }
        for(int aa:a){
            System.out.print(aa+" ");
        }
        // Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    }
}
