package BinarySearch;

public class LowerBond {
    public static void main(String[] args) {
        int a[]={3,5,8,9,15,19};
        int x=9;
        int low=0;
        int high=a.length-1;
        int val=0;
        while(low<=high){
           // int i=0;
            int mid=(low+high)/2;

           if(a[mid]>x){
               //System.out.println("LowerBound");
                high=mid-1;
                val=mid;
            }
            else {
             //  System.out.println("UpperBond");
                low=mid+1;
               // val=mid+1;

            }

        }
        System.out.println(val);

    }
}
