public class cyclicSort03 {
    // Find duplicate no from range[1 to n] in arr of size (n+1)
    //if we have to find more than one no, then store the no in list and at last return the list
    public static void main(String[] args) {
        int arr[] = { 4, 6, 5, 3, 3, 2, 1 };
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] > arr.length)// to prevent OutOfBound Exception
                    i++;
                else if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    System.out.println("Duplicate no is " + arr[i]);
                    return;
                    // when arr[i]==arr[correct] && arr[i]!=index+1
                }
            } else
                i++;
        }
    }
}
