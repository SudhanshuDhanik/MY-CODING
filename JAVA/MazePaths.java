import java.util.ArrayList;
public class MazePaths {
    //Condition: We can move only towards right , down and horizontal
    static ArrayList<String> paths(String count,int init,int end){
        if(end==1 && init==1){
             ArrayList<String>combination=new ArrayList<String>();
            combination.add(count);
            return combination;
        }

        ArrayList<String>combination=new ArrayList<String>();

      if(end>1)
 combination.addAll(paths(count+'R',init,end-1));
 if(init>1)
 combination.addAll(paths(count+'D',init-1,end));
 if(end>1 && init>1){
 combination.addAll(paths(count+'H',init-1,end-1));

 }


return combination;
    }
   public static void main(String[] args) {
    System.out.println(paths("",4,3));
   } 
}
