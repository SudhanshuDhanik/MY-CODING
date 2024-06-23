public class reverse {
 public static void main(String[] args) {
    //Same logic will be used for palindrome
    int no=12345;
    int sum=0;
    while(no>0){
        int r=no%10;
        sum=(sum*10)+r;
        no=no/10;
    }
    System.out.println("Reverse of given no is "+sum);
 }   
}
