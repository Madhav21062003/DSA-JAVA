package linkedlist;

public class PalindromeLL {


        public static class ListNode{
            int val;
             ListNode next;

            ListNode(int val){
                this.val = val ;
            }
        }

    public static void main(String[] args) {


        ReverseList.ListNode a = new ReverseList.ListNode(1);
        ReverseList.ListNode b = new ReverseList.ListNode(2);
        ReverseList.ListNode c = new ReverseList.ListNode(3);
        ReverseList.ListNode d = new ReverseList.ListNode(4);
        ReverseList.ListNode e = new ReverseList.ListNode(5);
        ReverseList.ListNode f = new ReverseList.ListNode(6);
        ReverseList.ListNode g = new ReverseList.ListNode(7);
        ReverseList.ListNode h = new ReverseList.ListNode(8);
        ReverseList.ListNode i = new ReverseList.ListNode(9);
        ReverseList.ListNode j = new ReverseList.ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
    }

    public static  ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode agla = null ;

        while(curr != null){
            agla = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = agla ;
        }
        return prev ;
    }
// checking list is palindrome or not
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        ListNode temp = reverseList(slow.next);
        slow.next = temp ;
        ListNode p1 = head ;
        ListNode p2 = slow.next ;

        while(p2 != null){
            if(p1.val != p2.val)
                return false ;

            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
