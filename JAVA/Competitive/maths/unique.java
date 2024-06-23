package maths;

public class unique {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,5,2,5};
        int unique=0;
        for(int n:arr){
            unique^=n;
    //unique=0^2^3^4^3^5^2^5=0^2^2^3^3^5^5^4=4
    //coz (0^0=0 and 1^1=0) and (0^1 or 1^0=1)
        }
        System.out.println(unique);
    }
}
