public class cyclicSort04 {
    //in arr from range[1 to n] by mistake one no get deleted
    //and one no get repeated.find the duplicate and missing no
    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 5, 3, 2 };
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
                System.out.println("Duplicate no is "+arr[j]);
                return;// so that last statement wouldn't print}
            }
        }
}
}