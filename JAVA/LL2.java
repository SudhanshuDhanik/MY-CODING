class ListNode
{
    
        ListNode next;
        ListNode prev;
        private int data;
        ListNode(int data){
            this.data=data;
            this.next=null;
    }
  static ListNode reverse(ListNode head) {
   ListNode prev = null;
   ListNode curr = head;
  
   while (curr != null) {
       ListNode next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
   }
   return prev;
}
 static ListNode getMiddle(ListNode head) {
   ListNode fast = head;
   ListNode slow = head;
   while (fast.next != null && fast.next.next != null) {
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow;
}
static boolean isPalindrome(ListNode head) {
   if(head == null || head.next == null) {
       return true;
   }
  
   ListNode firstHalfEnd = getMiddle(head);
   ListNode secondHalfStart = reverse(firstHalfEnd.next);
   ListNode firstHalfStart = head;
  
   while(secondHalfStart != null) {
       if(secondHalfStart.data != firstHalfStart.data) {
           return false;
       }
       secondHalfStart = secondHalfStart.next;
       firstHalfStart = firstHalfStart.next;
   }
  
   return true;
}
public static void main(String arg[]) {
     ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    System.out.println("list is"+isPalindrome(head));
}
}

