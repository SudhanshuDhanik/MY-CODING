import java.util.Arrays;
import java.util.Comparator;

public class comparator {
    // Function to print the largest number
   static String printLargest(int n, String[] arr) {
        
        // Sorting the array in descending order based on customized comparison using Comparator interface
        Arrays.sort(arr,new Comparator<String>(){
            @Override 
            public int compare(String x, String y){
                String xy = x+y;  // concatenating the current string with the next string
                String yx = y+x;  // concatenating the next string with the current string
                return yx.compareTo(xy);  // comparing the two concatenated strings in descending order
            }
        });
        
        String ans = "";
        for(int i=0; i<n; i++)
            ans += arr[i];  // concatenating all the strings in the sorted order
        
        return ans;  // returning the final result as a string
    }
public static void main(String[] args) {
   int n = 5;
String arr[] =  {"3", "30", "34", "5", "9"};
System.out.println(printLargest(n,arr));
}}

