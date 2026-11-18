package Day_17;

public class Remove_Nth_Node
{
    public static void main(String[] args)
    {

        // Static Linked List input: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call solution
        Sol_remove_Nth_Node sol = new Sol_remove_Nth_Node();
        head = sol.removeNthFromEnd(head, 2);

        // Print Linked List
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");

    }
}

class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Sol_remove_Nth_Node
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;

       ListNode firstPointer = dummy;
       ListNode secondPointer = dummy;

       for(int i=0;i<n;i++)
       {
           secondPointer = secondPointer.next;
       }

       while(secondPointer.next!=null)
       {
           firstPointer = firstPointer.next;
           secondPointer = secondPointer.next;
       }

       firstPointer.next = firstPointer.next.next;

      return dummy.next;
    }
}
