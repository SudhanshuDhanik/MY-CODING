class ListNode {
  int data;
  ListNode next;
  ListNode(int value)
  {
    this.data = value;
    this.next = null;
  }}

class LL3{
public static boolean hasCycle(ListNode head) {
   ListNode slow = head;
   ListNode fast = head;
  
   while(fast != null && fast.next != null) {
       slow = slow.next;
       fast = fast.next.next;
      
       if(fast == slow) {
           return true;
       }
   }
  
   return false;
}
public static void main(String arg[]) {
     ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = head.next.next;


    boolean result=hasCycle(head);
    System.out.println(result);
}}
 