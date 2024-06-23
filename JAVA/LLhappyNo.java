public class LLhappyNo {
    //Happy no- 19
    //1sq + 9sq=82
    //8sq + 2sq=68
    // 6sq+ 8sq=100
    // 1sq + 0sq + 0sq=1

    public static boolean isHappy(int n){
int slow=n,fast=n;
do{
    slow=findSquare(slow);
    fast=findSquare(findSquare(fast));
}
while(fast!=slow);
if (slow==1){
    return true;
}
return false;
    }
    static int findSquare(int no){
        int ans=0;
        while(no>0){
            int rem=no%10;
            ans+=rem*rem;
            no=no/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(12));

    }
}
