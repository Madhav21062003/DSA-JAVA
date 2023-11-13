package linkedlist;

public class RemoveNthNodeFromLast {

    public static class ListNode{
        int val;
        ListNode next ;

        ListNode(int val){
            this.val = val ;
        }
    }
    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);

        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e;

    a =   removeFromLast(a, 5);
      printList(a);



    }

    private static ListNode removeNthNode(ListNode head, int n) {

        if (head == null )
            return null ;

        if (head.next == null && n ==1)
            return null ;

        ListNode temp = head ;
        int size = 0 ;

        while (temp != null){

            temp = temp.next;
            size++;
        }

        if (n == size){
            head = head.next;
            return head ;
        }

        ListNode newNode = head;
        int t = 0;

        while (t < (size - n - 1)){
            newNode = newNode.next;
            t++;
        }
        return head;
    }
    public static void printList(ListNode  head){
        ListNode temp = head ;

        while (temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
    }

    // Remove Node from last from any position
    public static ListNode removeFromLast(ListNode head, int n){

        if (head == null )
            return null;

        if (head.next == null && n ==1)
            return null;



        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n ; i++) {
                fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
