import java.util.HashSet;
public class recursionintermediate {
    //1.TOWER OF HANOI , 0(2^n-1) ~ O(2^n)
    /*public static void towerOfHanoi(int n,String src,String helper,String dest) {
      if(n==1) {
     System.out.println("Transfer disk "+ n+" from "+src+" to "+dest);
    return;
      } towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+ n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper,src, dest);        
    }
    public static void main(String arg[]) {
       int n=3;
       towerOfHanoi(n,"S", "H", "D"); 
    }*/

   /* 
   //2.REVERSE STRING , O(n)
   public class recursionpractice {
   public static void reverse(String str, int i,String newstr) {
if(i==str.length()){
  System.out.println(newstr);
  return;
}
newstr=newstr+str.charAt(str.length()-1-i);
reverse(str, i+1, newstr);

}
public static void main(String args[]) {
reverse("sonuji", 0,"");
}} */

    /* 
    //3.first and last occurence of element, O(n)
    public static int first=-1;
    public static int last=-1;
    public static void findOccurence(String str,int idx,char element) {
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
      char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOccurence(str, idx+1, element);
    }
    public static void main(String arg[]) {
     String str="abvsahfffaufai";
     findOccurence(str, 0, 'a');   
    }*/

    /*
    //4.CHECK ARRAY IS SORTED OR NOT , O(n)
public static boolean isSorted(int arr[],int idx) {
    if(idx==arr.length-1){
        return true;
    }
    if(arr[idx]<arr[idx+1]){
      return isSorted(arr, idx+1);
    }
    else{
        return false;
    }
    
}
    public static void main(String args[]) {
        int arr[]={1,2,9,6,8,9};
        System.out.println(isSorted(arr, 0));
    }*/

    /* 
    //5.MOVE ALL X TO END OF THE STRING, O(n+count)=O(2n) ~ O(n)
    public static void moveAllX(String str,int idx,int count,String newString) {
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }       
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveAllX(str, idx+1, count, newString);
        }
        
    }
    public static void main(String args[]) {
        String str="axhhsxshxsjsxs";
        moveAllX(str, 0, 0, "");
    }*/

    /* 
//6.REMOVE DUPLICATES IN STRING , O(n)
public static boolean[] map=new boolean[26];
public static void removeDuplicates(String str,int idx,String newString) {
    if(idx==str.length()){
        System.out.println(newString);
        return;
    }
    char currChar=str.charAt(idx);
    if(map[currChar-'a']==true){
        removeDuplicates(str, idx+1, newString);
    }
    else{
        newString+=currChar;
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newString);
    }
}
public static void main(String args[]) {
    String str = "abgadbgsxeb";
    removeDuplicates(str,0, "");
}*/

  /* 
 //7.print all subsequences of string, O(2^n-1) ~ O(2^n)
 public static void subsequences(String str,int idx,String newString) {
    if(idx==str.length()){
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
//to be
subsequences(str, idx+1, newString+currChar);

//not to be
subsequences(str, idx+1, newString);
}
 public static void main(String arg[]) {
  String str="abc";
  subsequences(str, 0, "");  
 //output has 2^n strings including blank string when no char get added to newstring 
 }
*/

/* 
//8.print all unique subsequences of string
public static void subsequences(String str,int idx,String newString,HashSet<String>set) {
    if(idx==str.length()){
        if(set.contains(newString)){
            return;
        }
        else{
        System.out.println(newString);
        set.add(newString);
        return;
    }}
    char currChar = str.charAt(idx);
//to be
subsequences(str, idx+1, newString+currChar,set);

//not to be
subsequences(str, idx+1, newString,set);
}
 public static void main(String arg[]) {
  String str="aaa";
  HashSet<String> set =new HashSet<>();
  subsequences(str, 0, "",set);  }
 */

/* 
 //9.PRINT KEYPAD COMBINATION
 public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
 public static void combination(String str,int idx,String combination) {
    if(idx==str.length()){
        System.out.println(combination);
        return;
    }
    char currChar=str.charAt(idx);
    String mapping=keypad[currChar -  '0'];
    for(int i=0;i<mapping.length();i++){
        combination(str,idx+1,combination+mapping.charAt(i));
    }}
    public static void main(String args[]) {
        String str="23";
        combination(str,0,""); 
    }*/
 }
    

