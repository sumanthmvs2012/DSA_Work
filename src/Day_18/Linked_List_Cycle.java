package Day_18;


import java.util.HashSet;
import java.util.List;

public class Linked_List_Cycle {
    public static void main(String[] args)
    {
        /// Create Linked List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: connect node 5 back to node 3
        head.next.next.next.next.next = head.next.next;

        // Print input for reference
        System.out.println("Input Linked List:");
        ListNode temp = head;

        for (int i = 0; i < 8; i++) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("... (cycle continues)");

        // Call solution
        Solution sol = new Solution();
        boolean res = sol.hasCycle(head);

        System.out.println("Has Cycle?: " + res);

    }
}

class ListNode
{
      int val;
      ListNode next;
      ListNode(int x)
      {
          val = x;
          next = null;
      }
}

class Solution
{
    public boolean hasCycle(ListNode head)
    {
        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }
}
