package Arrays.Easy;

public class AppearOnceOptimal {
    public static void main(String[] args) {
        int a[]={2,1,2,1,1};
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        System.out.println(xor);
    }
}
