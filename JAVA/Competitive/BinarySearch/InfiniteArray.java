package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8, 9, 13, 15, 17, 19, 21, 23, 34, 67 };
        int target = 11;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[], int target) {
        // first find the range
        // first start with a box size of 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            // double the size of array
            end = end + ((end - start + 1) * 2);
            start = temp;
        }
        return pos(arr, target, start, end);
    }

    static int pos(int arr[], int target, int start, int end) {
        
        while (start <= end) {
            int mid = start + (end - start) / 2;// to solve problem of out of range if array is of big size
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
