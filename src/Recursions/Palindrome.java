package Recursions;

import java.util.Scanner;

public class Palindrome {
    public static void palin(int i,char ch[],int n){
        //  if(s==null)
       // boolean bh=true;
        if(ch[i]!=ch[n]){
          //bh=false;
            System.out.println("Not palindrome");
            return;
        }
        if(i>=n)
        {
            System.out.println("palindrome");
            return;
        }
        palin(i+1,ch,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char ch[]=a.toCharArray();
        boolean bh=true;
        for(int i=0,j=ch.length-1;i<=j;i++,j--){
            if(ch[i]!=ch[j]){
                bh=false;
                break;
            }
        }if(bh){
            System.out.println("palin");

        }
        else{
            System.out.println("not palin");
        }
      //  palin(0,ch,ch.length-1);

    }
}
