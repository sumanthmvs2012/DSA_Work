package Day_17;

public class Add_Two_Numbers
{
    public static void main(String[] args)
    {
        //1st Linked List input: 1 -> 2 -> 3 -> 4 -> 5
        ListNodes head = new ListNodes(1);
        head.next = new ListNodes(2);
        head.next.next = new ListNodes(3);
        head.next.next.next = new ListNodes(4);
        head.next.next.next.next = new ListNodes(5);

        //1st Linked List input: 1 -> 2 -> 3 -> 4 -> 5
        ListNodes head1 = new ListNodes(1);
        head1.next = new ListNodes(2);
        head1.next.next = new ListNodes(3);
        head1.next.next.next = new ListNodes(4);
        head1.next.next.next.next = new ListNodes(5);

        Solution sol = new Solution();
        ListNodes result = sol.addTwoNumbers(head, head1);


        System.out.println("1st linked list:");
        ListNodes current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");


        System.out.println("2nd linked list:");
        ListNodes current1 = head1;
        while (current1 != null) {
            System.out.print(current1.val + " -> ");
            current1 = current1.next;
        }
        System.out.println("null");


        System.out.println("Result Linked List:");
        ListNodes current2 = result;
        while (current2 != null)
        {
            System.out.print(current2.val + " -> ");
            current2 = current2.next;
        }
        System.out.println("null");
    }

}

class ListNodes
{
    int val;
    ListNodes next;
    ListNodes() {}
    ListNodes(int val) { this.val = val; }
    ListNodes(int val, ListNodes next) { this.val = val; this.next = next; }
}

class Solution
{
    public ListNodes addTwoNumbers(ListNodes l1, ListNodes l2)
    {
        ListNodes dummy = new ListNodes(0);
        ListNodes current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
           int sum = carry;

           if(l1!=null)
           {
               sum = sum + l1.val;
               l1 = l1.next;
           }

           if(l2 != null)
           {
               sum = sum + l2.val;
               l2 = l2.next;
           }

           carry = sum / 10;
           current.next = new ListNodes(sum % 10);
           current = current.next;
        }

        return dummy.next;
    }
}
