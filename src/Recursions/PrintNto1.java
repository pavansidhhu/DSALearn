package Recursions;

public class PrintNto1 {

    public static void main(String[] args) {
        int a=40;
        print(a);
    }
    static int count=10;
    public static void print(int n){
        if(n<0){
            return;
        }
        //count--;
        System.out.println(n);
       // count--;
        print(n-1);
    }


}
