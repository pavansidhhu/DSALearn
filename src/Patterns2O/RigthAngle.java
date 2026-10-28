package Patterns2O;

import java.util.Scanner;

public class RigthAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //up
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Down
        for(int i=0;i<=3;i++){
            for(int j=i;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
