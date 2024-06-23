public class MergeSort {
    //T.C ->O(logn)xO(n)=O(nlogn)

    public static void conquer(int arr[],int beg,int mid,int end) {
        int merged[]=new int [end-beg+1];
int idx1=beg;//initial index for arr1
int idx2=mid+1;//initial index for arr2
int x=0;//initial index for newarray
//T.C -> O(n)
while(idx1<=mid && idx2<=end){
    if(arr[idx1]<=arr[idx2]){
        merged[x++]=arr[idx1++];   
    }
    else{
        merged[x++]=arr[idx2++];
    }
}
     while(idx1<=mid){
         merged[x++]=arr[idx1++];   
     }   
     while(idx2<=end){
         merged[x++]=arr[idx2++];   
     }
     for(int i=0,j=beg;i<merged.length;i++,j++){
        arr[j]=merged[i];
     }
    }
    public static void divide(int arr[],int beg,int end) {
    //T.C-> O(logn){
        if(beg<end){
        int mid=beg+(end-beg)/2;//Same result as (beg+end)/2
        //Here it is used to reduce space complexity

        divide(arr, beg,mid);
        divide(arr, mid+1, end);
        conquer(arr,beg,mid,end);}
    }
    public static void main(String arg[]) {
     int arr[]={3,5,27,28,9};
     int n=arr.length;  
     divide(arr, 0, n-1);
     for(int i=0;i<n;i++){
        System.out.println(arr[i]);
     } 
    }
    
}
 