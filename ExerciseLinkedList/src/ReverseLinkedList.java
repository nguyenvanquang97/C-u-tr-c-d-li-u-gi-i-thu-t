public class ReverseLinkedList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode temp=head,p=null, q=null;
        while(temp!=null)
        {
            q=temp.next;
            temp.next=p;
            p=temp;
            temp=q;
        }
        return head=p;
    }
}
