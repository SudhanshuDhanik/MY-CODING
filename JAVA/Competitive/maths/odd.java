package maths;

public class odd {
    public static void main(String[] args) {
        int no=64;
        // 0110
      // & 0111
      // = 0110=6
        System.out.println(6&7);
        if((no & 1)==1){
            //e.g. 5&1=0101
               //       & 1
            //         =0001=1
            System.out.println("odd no");
        }
        else
        System.out.println("even number");
    }
}
