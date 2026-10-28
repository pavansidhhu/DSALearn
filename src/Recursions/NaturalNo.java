package Recursions;

import java.util.Scanner;

public class NaturalNo{
    static int sum=0;
    public static int sumnat(int i,int n){
       // int sum=0;
        if(i>n){
            System.out.println(sum);
            return sum;
        }
        sum=sum+i;

        sumnat(i+1,n);
        return 0;
    }
    public static int sumnat(int n){
        if(n==0){
            return 0;
        }
        return n+sumnat(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      /*  int res1=sumnat(1,a);
        System.out.println("res1:: "+res1);*/
        //parameter constr

      int res=sumnat(a);
        System.out.println("res:: "+res);

    }
}
