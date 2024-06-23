import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of fibonacci series");
        int no=sc.nextInt();
        int n1=0,n2=1,n3;
          System.out.println(n1);
            System.out.println(n2);
        for(int i=2;i<no;i++){
          n3=n1+n2;
          System.out.println(n3);
          n1=n2;
          n2=n3;


        }
    }
}