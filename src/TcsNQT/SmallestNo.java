package TcsNQT;

public class SmallestNo {
    public static void main(String[] args) {
        int a[]={8, 10, 5, 7, 9};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
        }
        System.out.println(min);
    }
}
