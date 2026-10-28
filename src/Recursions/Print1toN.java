package Recursions;

public class Print1toN {
    public static void main(String[] args) {
        int n=10;
        print(1,n);
    }
    static int count=0;
    public static void print(int n,int n1){
        if(n>n1){
            return;
        }
        System.out.println(n);
        print(n+1,n1);
    }


}
