import java.util.Arrays;

public class cyclicSort02 {
    // In cyclicsort, array range from [1 to n] or [0 to n] are given without
    // repitition
    // after sorting value=index+1 or =index e.g.
    // 1 should be at index 0 or 1
    
    // In this we have to find missing no.
    //if we have to find more than one no, then store the no in list and at last return the list
    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 3, 5, 7 };
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > arr.length)// to prevent OutOfBound Exception
                i++;
            else if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                System.out.println("Missing no is " + (j + 1));
                return;// so that last statement wouldn't print}
            }
        }
        // if last no is missing,[6,4,3,2,1,5];
        System.out.println("Missing no is " + (arr.length + 1));

    }
}
