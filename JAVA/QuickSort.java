public class QuickSort
//T.C.-> O(n^2) and theta(nlogn) 
    {
    public static int partition(int arr[],int low,int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void Quicksort(int arr[],int low,int high) {
       if(low<high){
        int pivotidx=partition(arr,low,high);
        Quicksort(arr, low, pivotidx-1);
        Quicksort(arr, pivotidx+1, high);
       } 
    }
    public static void main(String args[]) {
        int[] arr={7,9,86,6,796,86};
        int n=arr.length;
Quicksort(arr, 0, n-1);
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       } 
    }
    
}
