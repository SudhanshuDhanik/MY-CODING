package BinarySearch;
import java.util.Scanner;
public class CeilingAndFloorOfNumber {
 //Ceiling=Smallest element in array greater or = target
//arr={2,3,14,16,18}
//ceiling(target=14)=14
//celing(target=15)=16 
 //Floor=greatest element in array smaller or = target
//arr={2,3,14,16,18}
//floor(target=14)=14
//floor(target=15)=14 
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int arr[]={2,4,6,9,14,16,30};
System.out.print("Enter no to search ceiling number: ");
int target=sc.nextInt();
System.out.println("ceiling no of "+target+" is "+ceiling(arr,target));
System.out.println("floor no of "+target+" is "+floor(arr,target));

}
static int ceiling(int arr[],int target){
     if(target>arr[arr.length-1]){
        return -1;}
        else{
            int start=0;
     int end=arr.length-1;
     while(start<end){
         int mid=start+(end-start)/2;//to solve problem of out of range if array is of big size
        if(arr[mid]==target){
            return arr[mid];
        }
        else if(arr[mid]<target)
           start=mid+1;
           else 
           end=mid-1;
     }
    return arr[start+1];
    //  or  return arr[end+1];
        }
     }
     static int floor(int arr[],int target){
     if(target<arr[0]){
        return -1;}
        else{
            int start=0;
     int end=arr.length-1;
     while(start<end){
         int mid=start+(end-start)/2;//to solve problem of out of range if array is of big size
        if(arr[mid]==target){
            return arr[mid];
        }
        else if(arr[mid]<target)
           start=mid+1;
           else 
           end=mid-1;
     }
    return arr[start];
        //  or  return arr[end];
        }
     }
    }
    

