import java.util.Arrays;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 4, 5, 6, 7, 7, 4 };
        int k=0;
        for(int i=0;i<arr.length;i++){
           int j;
           for( j=0;j<i;j++){
             if(arr[i]==arr[j])
             break;
           }
           if(i==j){
            arr[k++]=arr[i];
           }

        }
for(int  i=0;i<k;i++)    {
    System.out.println(arr[i]);
}}}