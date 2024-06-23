package BinarySearch;

public class Rotated {
    //arr={1,2,3,4,5,6}
    //rotated twice. arr={5,6,1,2,3,4}
    public static void main(String[] args) {
        int arr[]={8,8,9,11,13,13,1,2,3,3};
        //try{8,1,2,3,4};//try{3,4,5,8,9,20};//try{3,4,5,8,1,2}
        System.out.println(rotate(arr));
    System.out.println("No of rotations are:"+(pivot(arr)+1));}
    //Largest element or element from where array get decrease
        static int rotate(int arr[]){
            if(pivot(arr)==-1)
            return binary(arr);
            else 
            return pivot(arr);
        
    }
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            return mid;
            else if(arr[mid]<arr[mid-1])
            return mid-1;
            else if(arr[mid]<arr[start])
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
    static int binary(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        int target=arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;// to solve problem of out of range if array is of big size
            if (arr[mid] == target) {
                return mid;}
             else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    }

