package BinarySearch;

public class InsertPos {
    public static void main(String[] args) {
        int a[]={1,2,4,7};
        int x=10;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<=x && a[i+1]>=x){
                System.out.println(i+1);
                break;
            }

        }
    }
}
