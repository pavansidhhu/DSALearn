package Arrays.Easy;

public class CheckSorted {

    public static void StriverLo(int a[]){
        boolean bh=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<=a[i+1]){

            }
            else{
                bh=false;
                break;
            }
        }
        System.out.println("Check "+bh);
    }
    public static void main(String[] args) {
        int a[]={1,10,2,3,4,5,6};
        StriverLo(a);
        boolean bh=false;
        for(int i=0;i<a.length-1;i++){
            int did=0;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    did=1;
                }
            }
            if(did==0){
                bh=true;
                break;
            }
        }
        System.out.println(bh);
    }
}
