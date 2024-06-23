package BinarySearch;

public class Peak {
   //Peak index/element in mountain array(bitonic array) 
   public static void main(String[] args) {
    int arr[]={1,2,4,5,5,4,2};
    System.out.println(peak(arr));
   }
   static int peak(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(end>start){
        int mid=start+ (end-start) / 2;
        if(arr[mid]>arr[mid+1])
        end=mid;
        else
        start=mid+1;}
 //in the end,both start==end will point to same largest element of array
 return arr[end];//or return start;
    
   }
}
