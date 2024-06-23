package maths;
public class bitmanipulation {
    public static void main(String arg[]) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        //get bit
        if((bitMask & n)==0){
            System.out.println("Bit is zero");
        }
        else
        System.out.println("Bit  is one");

        //set bit
        pos=1;
        bitMask=1<<pos;
        int newno=bitMask|n;
        System.out.println(newno);

        //clear bit
        pos=2; 
        bitMask=1<<pos;
        int notbitMask=~(bitMask);
        int newnumber=notbitMask&n;
        System.out.println(newnumber);

        //update bit
        // to make 0 to 1 we use set bit      
        // to make 1 to 0 we use clear bit

    }
}
