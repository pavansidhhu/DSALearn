package BinarySearch;

public class FindTraget {
    public static int binse(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return 1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
        }
return -1;
    }
    public static void main(String[] args) {
        int a[]={3, 4, 6, 7, 9, 12, 16, 17};
        int traget=10;
        int a1=binse(a,traget);
        if(a1==1){
            System.out.println("found");
        }
        else{
            System.out.println("notfound");
        }
    }
}
