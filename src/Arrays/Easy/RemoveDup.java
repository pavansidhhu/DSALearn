package Arrays.Easy;

import java.util.Arrays;

public class RemoveDup {

    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,9,6,5};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        Arrays.sort(a);
        for(int a1:a){
            if(a1==0){
                continue;
            }
            System.out.print(a1+" ");
        }
    }
}
