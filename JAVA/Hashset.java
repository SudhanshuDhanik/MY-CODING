import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String arg[]) {
        HashSet<Integer>set=new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        //Size
       System.out.println("sizeof set is: "+set.size());

       //Print all elements
       System.out.println(set);

    //Search
    if(set.contains(1)){
        System.out.println("Set contains 1");
    }
    if(!set.contains(6)){
        System.out.println("doesn't contain");
    }    

   //Delete
   set.remove(2);
   if(!set.contains(2)){
    System.out.println("Doesnot contains 2");
   }

   //Iterator 
   Iterator it=set.iterator();
   //HasNext ; next
   while(it.hasNext()){
    System.out.println(it.next());
   }

}}
