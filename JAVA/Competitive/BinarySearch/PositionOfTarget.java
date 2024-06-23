package BinarySearch;
import java.util.Arrays;
public class PositionOfTarget {
    // First and last pos of target
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8, 8, 9 };
        int target = 8;
        System.out.println("First and last positions of target element are " + search(arr, target) + " respectively");

    }

    static String search(int arr[], int target) {
        int ans[] = { 0, 0 };
        int start = pos(arr, target, true);
        int end = pos(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return Arrays.toString(ans);

    }

    static int pos(int arr[], int target, boolean findIndex) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;// to solve problem of out of range if array is of big size
            if (arr[mid] == target) {
                ans = mid;
                if (findIndex) {
                    end = mid - 1;
                } else
                    start = mid + 1;}
             else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

}
