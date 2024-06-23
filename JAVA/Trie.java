public class Trie {
    static class node{
        node[] children;
         boolean eow;//End of word

     node(){
        children = new node[26];
        for(int i=0;i<26;i++){
            children[i]=null;
        }
        eow=false;
     }}
     static node root=new node();

     //Insertion 
     static void insert(String word){
        node curr=root;
        for(int i=0;i<word.length();i++){
           int idx=word.charAt(i) - 'a';
        if(curr.children[idx]==null)
         curr.children[idx]=new node();  //add new node
         if(i==word.length()-1)
         curr.children[idx].eow=true;
             curr=curr.children[idx];
         }
     }
     //Search
      static boolean search(String key){
        //T.C.->O(L),L:key length
        node curr=root;
        for(int i=0;i<key.length();i++){
           int idx=key.charAt(i) - 'a';

        if(curr.children[idx]==null)
         return false;
         if(i==key.length()-1 && curr.children[idx].eow==false)
         return false;
         curr=curr.children[idx];
             }
             return true;
            }
          //QUESTION 1
            static boolean wordBreak(String key){
                if(key.length()==0)
                return true;
                for(int i=1;i<=key.length();i++){
                   String firstPart=key.substring(0, i);
                   String secPart=key.substring(i);
                   if(search(firstPart) && wordBreak(secPart))
                   return true;
                }
                return false;
            
            }
               //QUESTION 2
      static boolean startsWith(String prefix) {
       node curr = root;
       for(int i=0; i<prefix.length(); i++) {
           int idx = prefix.charAt(i)-'a';
           if(curr.children[idx] == null) {
               return false;
           }
           curr = curr.children[idx];
       }
       return true;
   }
   //QUESTION 3:COUNT UNIQUE SUBSTRINGS
   public static int countNodes(node root) {
       if(root == null) {
           return 0;
       }
       int count = 0;
       for(int i=0; i<26; i++) {
           if(root.children[i] != null) {
               count+= countNodes(root.children[i]);
           }
       }
       return 1+count; //extra one for the self node
   }

              //QUESTION 4: LONGEST WORD WITH ALL PREFIXES
            static String ans = "";
public static void longestWord(node root, StringBuilder curr) {
       for(int i=0; i<26; i++) {
           if(root.children[i] != null && root.children[i].eow == true) {
               curr.append((char)(i+'a'));
               if(curr.length() > ans.length()) {
                   ans = curr.toString();
               }
               longestWord(root.children[i], curr);
               curr.deleteCharAt(curr.length()-1);
           }
       }
   }

    public static void main(String Arg[]){
  /*      String words[]={"the","a","there","their","any"};
       for(int i=0;i<words.length;i++){
           insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
        System.out.println(search("a"));
        
        System.out.println();
        String key="theathereaaa";
      System.out.println(wordBreak(key));
      //the,a,there,a,a,a. 

      System.out.println();
      String prefix="th";
      System.out.println(startsWith(prefix));
*/

      String str="apple";
      for(int i=0;i<str.length();i++){
        String suffix=str.substring(i);
        insert(suffix);
      }
      System.out.println(countNodes(root));
      
    
      String words[]={"a","banana","app","ap","appl","apple","apply"};
        for(int i=0;i<words.length;i++){
           insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
        //if we remove apple then our ans will be apply
    }
    
}
