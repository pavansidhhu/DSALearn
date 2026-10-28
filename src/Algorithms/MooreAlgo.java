package Algorithms;

public class MooreAlgo {
    public static void main(String[] args) {
        int a[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
        int ele=0;
        int co=0;
        for(int i=0;i<a.length;i++){
            if(co==0){
                ele=a[i];
            }
            else if(a[i]==ele){
                co++;
            }
            else{
                co--;
            }
        }
        System.out.println(ele);
    }
}
