
public class StringPalindrome {
    public static void main(String[] args) {
        String str="sonunos";
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
            System.out.println("not Palindrome");
        return;}
        }
            System.out.println("palindrome");
        }
    }
