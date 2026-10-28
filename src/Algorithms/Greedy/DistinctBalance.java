package Algorithms.Greedy;

public class DistinctBalance {
    public static void main(String[] args) {
        int a=4;
        int b=11;
        while(b>0){
            int re=b%a;
            if(re<=1){
                b=b/a;
            }
            else if(re==a-1){
                b=b/a+1;
            }
            else{
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
