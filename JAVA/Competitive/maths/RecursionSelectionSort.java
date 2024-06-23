package maths;

import java.util.Arrays;

public class RecursionSelectionSort {
    static void selection(int arr[], int i, int min, int j) {
        if (i == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (j < arr.length) {
            if (arr[j] < min) {
                int temp = arr[j];
                arr[j] = min;
                min = temp;
            }
            arr[i] = min;
            selection(arr, i, min, j + 1);
        }else
        selection(arr, i + 1, arr[i+1], i + 2);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 3, 21, 7 };
        selection(arr, 0, arr[0], 1);
    }
}
