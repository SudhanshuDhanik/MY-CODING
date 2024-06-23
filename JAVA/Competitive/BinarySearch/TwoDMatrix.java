package BinarySearch;

import java.util.Arrays;

public class TwoDMatrix {
    public static void main(String[] args) {
        //Here  each row and col is sorted separately
        int arr[][]={{10,20,30,40,46},
                     {11,24,33,45,47},
                     {13,27,43,56,59},
                     {28,50,54,67,78} };
        int target=78;
        System.out.println(Arrays.toString(twoD(arr,target)));
    }
    static int[] twoD(int arr[][],int target){
      int row=0;
      int col=arr[0].length-1;

      while (row<arr.length && col>=0){
          if(arr[row][col]==target)
              return new int[]{row,col};

          if(arr[row][col]<target)           
              row++;                  //eliminates the row which has value< target
          else
              col--;
      }
      return new int[]{-1,-1};
}}
