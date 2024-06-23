import java.util.ArrayList; //or import java.util.*;
public class RecursionAdvanced {
   /*  //1.print all permutations of string , O(n!)
    public class recursionpractice {
static void perm(String str,String perm){
  if(str.length()==0){
    System.out.println(perm);
    return;
  }
 for(int j=0;j<str.length();j++){
  String newstr = str.substring(0, j) + str.substring(j+1);
  perm(newstr, perm+str.charAt(j));
 }
}
  
  public static void main(String[] args) {
    perm("abc","");
  }
}*/

  /*   //2.Count total paths to move from (0,0) to (n,m)
    //Cond: we can move only right and downwards
    public static int countPaths(int i,int j,int n,int m) {
        if(i==n || j==m)
        return 0;
        if(i==n-1 && j==m-1)
                return 1;
        //move downwards
        int downPaths=countPaths(i+1, j, n, m);
        
        //move right
        int rightPaths=countPaths(i, j+1, n, m);
        return (downPaths+rightPaths);
    }
    public static void main(String args[]) {
        int n=3,m=3;
       int totalPaths= countPaths(0, 0, n, m);
       System.out.println(totalPaths);       
    }*/

  /*  // 3.place tiles of size 1x2 in a floor 4x2
    public static int placeTiles(int n,int m) {
        if(n==m)
        return 2;
        if(n<m)
        return 1;
        //vertically
        int vertPlacements=placeTiles(n-m, m);

        //horizontally
        int horPlacements=placeTiles(n-1,m);
        
        return vertPlacements+horPlacements;
        
    }
    public static void main(String arg[]) {
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }*/

    /*// 4.no of ways to invite n people,single or in pairs
     public static int callGuest(int n) {

        if(n<=1)
        return 1;
        //single
        int way1=callGuest(n-1);

        //pair
        int way2=(n-1)*callGuest(n-2);

        return way1+way2;
     }
     public static void main(String args[]) {
       int n=4;
       System.out.println(callGuest(n)); 
     }*/

     // 5.print all subsets of set of first n natural no , O(2^n)
  
     public  static void findSubset(int n,ArrayList<Integer>subset) {
        if(n==0){
        for(int i =0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
        return;}
        //add hoga
        subset.add(n);
        findSubset(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
     }

     public static void main(String arg[]) {
     int n=3;
     ArrayList<Integer>subset=new ArrayList<>();   
     findSubset(n, subset);    }
}
