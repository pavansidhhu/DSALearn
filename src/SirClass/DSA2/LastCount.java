package SirClass.DSA2;

import java.util.Scanner;

public class LastCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println((int)CountOfWord(a));

    }
    public static int CountOfWord(String s){
        String s1[]=s.split(" ");
         String s2=s1[s1.length-1];
         return s2.length();
    }
}
