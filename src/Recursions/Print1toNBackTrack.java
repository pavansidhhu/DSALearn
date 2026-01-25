package Recursions;

import java.util.Scanner;

public class Print1toNBackTrack {
    public static void print(int n){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        print(a);
    }
}
