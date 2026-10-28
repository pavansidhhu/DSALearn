package Recursions;

import java.util.Scanner;

public class ReverseArray {
    public static void rev(int i,int arr[]){
        if(i>=arr.length){
            return;
        }
        rev(i+1,arr);
        System.out.println(arr[i]);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,5,6,7,8};
        rev(0,a);
    }
}
