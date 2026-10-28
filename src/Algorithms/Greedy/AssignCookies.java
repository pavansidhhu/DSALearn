package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gre[]={1, 2};
        int ck[]={1, 2, 3};
        Arrays.sort(gre);
        Arrays.sort(ck);
        int r=0;
        int l=0;
        while(l<ck.length && r<gre.length){
            if(gre[r]<=ck[l]){
                r++;
            }
            l++;
        }
        System.out.println(r);

    }
}
