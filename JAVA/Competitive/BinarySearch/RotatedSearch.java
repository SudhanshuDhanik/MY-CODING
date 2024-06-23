package BinarySearch;

public class RotatedSearch {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 3, 4 };
        // try{8,1,2,3,4};//try{3,4,5,8,9,20};//try{3,4,5,8,1,2}
        System.out.println(binary(arr, 9, 0, arr.length - 1));
    }

    static int binary(int arr[], int target, int start, int end) {


            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    return binary(arr, target, start, mid - 1);
                } else
                    return binary(arr, target, mid + 1, end);
            }
            if (target >= arr[mid] && target <= arr[end]) {
                return binary(arr, target, mid+1, end);
                
            }
    return binary(arr, target, start, mid-1);
        //use in that type of array  int arr[] = { 8, 9, 1, 2, 3, 4 };
        }
    }

