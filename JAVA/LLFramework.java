import java.util.Collections;
import java.util.LinkedList;
public class LLFramework {

   public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();
       list.add("is");
       list.addLast("bbvv");
       list.add("list");
       list.addFirst("this");
       list.add(3, "linked");
       list.set(2, "a");
       System.out.println(list);


       System.out.println(list.get(0));
       System.out.println(list.size());   
       list.remove(3);
       list.removeFirst();
       list.removeLast();
       System.out.println(list);
       
       LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(2);
       System.out.println(list2);
       Collections.reverse(list2);
       System.out.println(list2);
   }
}
