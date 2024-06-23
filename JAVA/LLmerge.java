import java.util.LinkedList;
class Node {
    int data;
    Node next;
    Node(int value)
    {
      this.data = value;
      this.next = null;
    }
    }
    public class LLmerge {
        static LinkedList<Integer> ll=new LinkedList<>();
     
    static void merge(Node firstlist,Node secondlist){
while((firstlist!=null) && (secondlist!=null)){
if(firstlist.data>secondlist.data){
    ll.addLast(secondlist.data);
    secondlist=secondlist.next;
}
else{
ll.addLast(firstlist.data);
firstlist=firstlist.next;

}}
while(firstlist!=null){
ll.addLast(firstlist.data);
firstlist=firstlist.next;
}
while(secondlist!=null){
    ll.addLast(secondlist.data);
    secondlist=secondlist.next;
    }
}
    
  public static void main(String[] args) {
    Node firstlist=new Node(1);
    firstlist.next=new Node(2);
    firstlist.next.next=new Node(5);
    Node secondlist=new Node(1);
    secondlist.next=new Node(3);
    secondlist.next.next=new Node(4);
    secondlist.next.next.next=new Node(7);
   
merge(firstlist,secondlist);
System.out.println(ll);
  }  
}
