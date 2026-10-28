package Recursions;

import java.util.Scanner;

public class Factorial {

    public static int fat(int a) {
        if(a==1){
            return 1;
        }
        return a*fat(a-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=fat(a);
        System.out.println("res:: "+res);
    }
}
