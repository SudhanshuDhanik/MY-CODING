public class Reoccurence {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 4, 5, 6, 7, 8, 2, 4, 6, 7 };
        int temp[] = new int[arr.length];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int visited = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp[j] == arr[i]) {
                    break;
                }
                if (arr[i] == arr[j]) {
                    visited++;
                }
            }
            if (count != visited) {
                System.out.println(arr[i] + " occurs " + visited + " times");

            }
            temp[++index] = arr[i];
        }
    }
}
