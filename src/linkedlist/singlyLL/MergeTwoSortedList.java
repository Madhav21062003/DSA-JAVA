package linkedlist.singlyLL;

public class MergeTwoSortedList {

    private static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static void main(String[] args) {

    }

    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node head = new Node(0);
        Node tail = head;

        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                tail.next = head1;
                head1 = head1.next;
                tail = tail.next;
                tail.next = null;
            }
            else
            {
                tail.next = head2;
                head2 = head2.next;
                tail = tail.next;
                tail.next = null;
            }
        }

        if(head1 != null){
            tail.next = head1;
        }
        else {
            tail.next = head2;
        }

        tail = head;
        head = head.next;

        return head;


    }
}
