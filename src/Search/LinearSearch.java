package Search;


public class LinearSearch {
    public static void main(String[] args) {
        int a[]={2,4,5,6,3,5,9};
        int target=9;
        System.out.println(SearchOperation(target,a));
    }

    public static Object SearchOperation(int traget,int arr[]) {
        boolean t=false;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==traget){
                b=arr[i];
                t=true;
                break;
            }
        }
        return t+" "+b;
    }
}
