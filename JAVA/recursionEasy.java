import java.util.Scanner;
public class recursionEasy {
    
   /* //Sum of numbers
    public static int sum(int n) {
     if(n==0)
        return 0;        
     else{
     int sums=n+sum(n-1);
        return sums;
    }}

    //Factorial of no
    public static int fact(int n) {
        if(n==0 || n==1)
        return 1;
        else
            return n*fact(n-1);
    }

    //Fibonacci series
    public static void fibo(int a,int b,int n) {
        if(n==0)
        return;
        else{
        int c=a+b;
        System.out.println(c);
        fibo(b, c, n-1);
        }
    }
        
    
        public static void main(String args[]) {
             Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Sum of first " + n + " natural number is " + sum(n)); 
            
           int factorial= fact(n);
            System.out.println(factorial);
            
            int a=0;int b=1;
             System.out.println(a+"\n"+ b);
            fibo(a, b, n-2);*/


            public static void main(String args[]) {
                int x=2;int n=5;
                int ans=calcPower(x,n);
                System.out.println(ans);
            }  
            public static int calcPower(int x,int n) {
                if(n==0)
                return 1;
                else if(x==0) 
                return 0;
          /*          //Print x^n if stack height is n 
              else{
                  int xPownm1=calcPower(x, n-1);
              int xpown=x*xPownm1;
          return xpown;                }         
           */
                
                
                //print x^n if stack height is logn
                //if n is even
                else if(n%2==0){
                    return calcPower(x, n/2)*calcPower(x, n/2);
                }
                //if n is odd
                else{
                    return calcPower(x, n/2)*calcPower(x, n/2)*x; }                
                  

            }
                }
              
                   


