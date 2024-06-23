class Node{
    int data;
    Node next;
    Node(int value)
    {
      this.data = value;
      this.next = null;
    }}

public class LLMiddle {
    static int middle(Node head){
       Node slow=head;
       Node fast=head; 
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow.data;
    }
    public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5); 

    System.out.println(middle(head));
    }
}
