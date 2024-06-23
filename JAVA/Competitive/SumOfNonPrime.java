import java.util.Scanner;
public class SumOfNonPrime {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int sum=0;
       for(int i=0;i<10;i++){
         arr[i]=sc.nextInt();
       }
       for(int i=0;i<10;i++){
        for(int j=2;j<arr[i]-1;j++)
        if(arr[i]%j!=0 && arr[i]>2)
        continue;
        else{
        sum+=arr[i];
        break;}
       }
       System.out.println(sum);
       sc.close();
    }
}
