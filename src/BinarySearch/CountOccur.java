package BinarySearch;

public class CountOccur {
    public static void main(String[] args) {
        int arr[]={2, 2 , 3 , 3 , 3 , 3 , 4};
        int k=3;
        int n= arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        System.out.println(first);

    }
}
