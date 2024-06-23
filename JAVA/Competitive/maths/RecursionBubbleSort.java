package maths;

import java.util.Arrays;

public class RecursionBubbleSort {
    static void bubble(int arr[], int i, int j) {
        if (j == 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (i >= j) {
            bubble(arr, 0, j - 1);
        } else {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubble(arr, i + 1, j);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 3, 21, 7 };
        bubble(arr, 0, arr.length - 1);
    }
}