package TcsNQT;

import java.util.Arrays;

public class IncDecs {
    public static void main(String[] args) {
        int a[]={4,2,8,6,15,5,9,20};
        int de=a.length/2;
        Arrays.sort(a);

        for(int i=de;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        for(int a1:a){
            System.out.print(a1);
        }
    }
}
