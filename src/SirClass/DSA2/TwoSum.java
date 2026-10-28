package SirClass.DSA2;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int nums[] = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }
        int traget = sc.nextInt();
        int cc[]=Addtwo(nums,traget);
        for(int f:cc){
            System.out.print(f+" ");
        }
    }

    public static int[] Addtwo(int nums[], int traget) {
        boolean bh = false;
        int k=0;
        int l=0;
        int cc[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {


                if ((nums[i] + nums[j]) == traget) {
                    bh = true;
                    cc[0]=i;
                    cc[1]=j;
                    break;
                }
            }
            if (bh) {
                break;
            }
        }

return cc ;
    }
}
