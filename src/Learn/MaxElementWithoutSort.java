package Learn;

import java.util.Scanner;

public class MaxElementWithoutSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={34,5,60,26,53,65,71,45};
        int max=0;
        int max2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
            }
            else if((a[i]>=max2)&&(a[i]!=max)){
                max2=a[i];
            }
        }


        System.out.println(max);
        System.out.println(max2);
    }
}
