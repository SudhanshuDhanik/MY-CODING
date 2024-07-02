public class LeetCodeSubstring {
    //Count no of time "geek" occur in string as a susequence

    //https://practice.geeksforgeeks.org/contest/gfg-weekly-160-rated-contest/problems

        
class Solution {
    public static int geekCount(String s) {
        // code here
        int g=0,e1=0,e2=0,k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='g')
            g++;
            else if(s.charAt(i)=='e'){
                e1=(e1+e2)%1000000007;
                e2=(e2+g)%1000000007;
            }
            else if(s.charAt(i)=='k'){
                k=(k+e1)%1000000007;
            }
        }
        return k;
    }

    }
    
}
