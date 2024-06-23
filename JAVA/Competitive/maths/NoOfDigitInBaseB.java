package maths;

public class NoOfDigitInBaseB {
    public static void main(String[] args) {
       int n=10;
       int base=2;
       //let log2(10)=x
       //then 10=2^x   so,x=3.32 and int value is 3 and 
       //after adding 1 we got 10=4 which is true for base 2 10=(1010)
       //similarly, log10(53673)=x
       //53673=10^x    so,int(x)=4 and after adding 1 we got our no of digit which is equal to 5
       //so formula we get is int(x)+1,where x=logbase(n) which can be written as following:
       //(int)(Math.log(n)/Math.log(base))
       int ans=(int)(Math.log(n)/Math.log(base))+1;
       System.out.println(ans);
    }
}
