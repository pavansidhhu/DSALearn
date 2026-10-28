package SirClass;

import java.util.Scanner;

public class RollSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={115,111,304,501,112,876,450,345};
        int b=304;
        boolean bh=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
               bh=true;
               break;
            }
        }
        if(bh){
            System.out.println("rollno found");
        }
        else{
            System.out.println("roll not found");
        }
    }
}
