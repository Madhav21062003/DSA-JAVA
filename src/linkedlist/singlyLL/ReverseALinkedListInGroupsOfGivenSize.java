package linkedlist.singlyLL;

public class ReverseALinkedListInGroupsOfGivenSize {

   static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    public static void main(String[] args) {

    }

    public static Node reverse(Node head, int k)
    {
        // Create dummy Node first
        Node first = new Node(0);
        first.next = head;
        head = first;
        int x = 0;
        Node second;
        Node prev;
        Node curr;
        Node front;

        while(first.next != null){
            x = k;
            second = first.next;
            prev = first;
            curr = first.next;

            while (x != 0 && curr != null){
                front = curr.next;
                curr.next = prev;
                prev = curr;
                curr = front;
                x--;
            }

            first.next = prev;
            second.next = curr;
            first = second;
        }

        // Dummy Node would deleted
        first = head;
        head = head.next;

        return head;
    }
}
