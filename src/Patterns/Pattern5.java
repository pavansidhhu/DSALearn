package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=4-i-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=2*i+1;j>=0;j--){
                System.out.print("*");
            }
            for(int j=4-i-1;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
