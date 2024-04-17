package linkedlist.singlyLL;

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

      a =   removeNthFromEnd(a, 2);
      printList(a);



    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        if(temp == null){
            return null;
        }

        if(temp.next == null && n == 1){
            return null;
        }

        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        count = count - n ;

        // if we eant to delete the first Node i.e count = 0;
        if(count == 0){
            temp = head;
            head = head.next;

            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while(count != 0){
            prev = curr;
            curr = curr.next;
            count = count - 1;
        }
        prev.next = curr.next;

        return head;
    }

    public static void printList(ListNode  head){
        ListNode temp = head ;

        while (temp!= null){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
    }


}
