package TcsNQT;

public class LargestNo {
    public static void main(String[] args) {
        int a[]={8, 10, 5, 7, 9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        System.out.println(max);
    }
}
