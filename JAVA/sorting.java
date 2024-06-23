import java.util.Arrays;

public class sorting {
    public static void main(String args[]) {
        int arr[]={56,34,23,5,67,28,59};
        
/*         //bubble sort O(n^2)
          for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }}}
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }*/


          //Selection sort O(n^2)
for(int i=0;i<arr.length;i++){
    int min=arr[i];
    for(int j=i;j<arr.length;j++){
if(min>arr[j]){
    int temp=min;
    min=arr[j];
    arr[j]=temp;
}
arr[i]=min;
    }
}
        System.out.println(Arrays.toString(arr));
    }

         /*  //Insertion sort O(n^2)
           for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
           } 
            for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                    

        }*/
          }    
    
