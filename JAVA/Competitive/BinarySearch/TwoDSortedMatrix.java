package BinarySearch;

import java.util.Arrays;

public class TwoDSortedMatrix {
    

//This solution also works for the sorted matrix.
// It is similar to the row and column sorted matrix problem.

private static int[] twoD(int[][] matrix, int target){
        int row=0;
        int col=matrix[0].length-1;

        while (row<matrix.length && col>=0){
            if(matrix[row][col]==target)
                return new int[]{row,col};

            if(matrix[row][col]<target)           
                row++;                  //eliminates the row which has value< target
            else
                col--;
        }
        return new int[]{-1,-1};
    }
     public static void main(String[] args) {
        int arr[][]={{1,2,3,4,6},
                     {11,12,13,15,17},
                     {20,27,33,36,39},
                     {48,50,54,67,78} };
        int target=48;
        System.out.println(Arrays.toString(twoD(arr,target)));
    }
}
