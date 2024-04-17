package linkedlist.singlyLL;


public class ReverseList {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val ;
        }
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        System.out.println("Original List");
        displayList(a);

        System.out.println("Reversed List");
        reverseList(a);

    }

    static void displayList(ListNode head){
        ListNode temp = head ;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Manual Method
    static void reverseList(ListNode head){
        ListNode temp = head ;
        if (temp == null)
            return;
         reverseList(temp.next);
        System.out.print(temp.val+" ");
    }

    // revrese Linked List with the help of recursion
    static ListNode reverse(ListNode head){

        if (head.next == null)
            return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head ;   // interchanging the connections
        head.next = null;
        return newHead;
    }

    // Reverse LL uing loops
    public static ListNode revreseList(ListNode head){
        ListNode prev  = null ;
        ListNode curr = head ;
        ListNode agla = null ;

        while (curr != null){
            agla = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
}
