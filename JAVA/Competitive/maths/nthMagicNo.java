package maths;
public class nthMagicNo{
    //if base=5 , then
    // 1=0*5^3 + 0*5^2 + 1*5^1=5
    // 2=0*5^3 + 1*5^2 + 0*5^1=25
    // 3=0*5^3 + 1*5^2 + 1*5^1=30
    // 4=1*5^3 + 0*5^2 + 0*5^1=125
    // 5=1*5^3 + 0*5^2 + 1*5^1=130


    public static void main(String[] args) {
        int no=8;
        System.out.println("Magic no for "+no+" is ");
        int ans=0;
        int base=5;
        while(no>0){
            int lsb=no&1;
            no=no>>1;
            ans+=base*lsb;
            base*=5;
        }
        System.out.println(ans);
    }
}