import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = { 3,10, 6, 4,1,2 };
        int a[][] = { { 2, 4, 5, }, { 4, 5, 7, }, { 6, 7, 8, } };
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(Arrays.deepToString(a));
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //Swapping using two pointer method
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void rev(int[] arr,int beg,int end){
           while(beg<end){
            swap(arr,beg,end);
            beg++;
            end--;
           }
           
    }
    static void swap(int []arr,int beg,int end){
        int temp=arr[beg];
        arr[beg]=arr[end];
        arr[end]=temp;
    }
}
