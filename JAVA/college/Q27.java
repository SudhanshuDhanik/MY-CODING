import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char arr[]=name.toCharArray();
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               if(arr[i]>arr[j]){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
                }
            }
            System.out.println(arr);
        }
    }

