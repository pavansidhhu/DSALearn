package Hashing;

import java.util.Scanner;

public class CharCountHAsjing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcdefgasdccf";
        int a=5;
        int hash[]=new int[26];
        //System.out.println(hash[0]);
        for(int i=0;i<s.length();i++){
          hash[s.charAt(i)-'a']++;
        }
        boolean ch=true;
        while(ch){
            if(a==0){
                break;
            }
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);

            a--;

        }

    }
}
