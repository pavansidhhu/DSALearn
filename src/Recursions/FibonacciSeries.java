package Recursions;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int l=fibo(n - 1);
        int s=fibo(n - 2);
        //System.out.println(l+s);
        return l+s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            System.out.print(fibo(i)+" ");
        }
       // fibo(a);
        System.out.println();
        int l=0;
        int h=1;
        System.out.print(l+" ");
        for(int i=0;i<a;i++){
            int l1=l+h;
            h=l;
            l=l1;

            System.out.print(l1+" ");
        }
    }
}
