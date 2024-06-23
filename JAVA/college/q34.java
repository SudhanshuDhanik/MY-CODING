import java.util.Scanner;

public class q34 {
   static int factorial(int x){
if(x==0)
return 1;
else
return x*factorial(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("Factorial of " + no + " is :" + factorial(no));
    }
}
