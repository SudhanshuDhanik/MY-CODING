class Node {
    int data;
    Node next;
    Node(int value)
    {
      this.data = value;
      this.next = null;
    }}
public class LLremoveduplictes {
   public static void printlist(Node newnode){
    while(newnode!=null){
        System.out.print(newnode.data+"->");
        newnode=newnode.next;
    }
    System.out.print("null");
    System.out.println();

   }
   static void removeduplicates(Node newnode){
    if(newnode==null){
        return;
    }
   while(newnode.next!=null){
    
    if(newnode.next!=null && newnode.data==newnode.next.data){
        newnode.next=newnode.next.next;
    }else
    newnode=newnode.next;
   }
   }
    public static void main(String[] args) {
     //given list is sorted
Node newnode=new Node(1);
newnode.next=new Node(1);
newnode.next.next=new Node(2);
newnode.next.next.next=new Node(3);
newnode.next.next.next.next=new Node(3);
newnode.next.next.next.next.next=new Node(4);
printlist(newnode);
removeduplicates(newnode);

printlist(newnode);





    }
}
