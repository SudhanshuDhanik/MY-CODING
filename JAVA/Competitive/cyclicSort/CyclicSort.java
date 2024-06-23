import java.util.Arrays;

public class CyclicSort {
       // In cyclicsort, array range from [1 to n] or [0 to n] are given without repitition
    // after sorting value=index+1 or =index e.g.
    // 1 should be at index 0 or 1
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 3, 1 };
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else
                i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
