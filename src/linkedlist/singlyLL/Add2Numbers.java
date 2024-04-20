package linkedlist.singlyLL;

public class Add2Numbers {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {

    }

    // Reverse the linked list
    static Node reverse(Node curr, Node prev){
        if(curr == null){
            return prev;
        }

        Node front = curr.next;
        curr.next = prev;

        return reverse(front, curr);
    }

    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){

        // Reverse the both Linked List Given to you
        first = reverse(first, null);
        second = reverse(second, null);

        Node curr1 = first;
        Node curr2 = second;

        // Creating Node for the answers
        Node head = new Node(0);
        Node tail = head;
        int sum = 0;
        int carry = 0;

        // Add the numbers
        while(curr1 != null && curr2 != null){

            sum = curr1.data + curr2.data + carry;
            tail.next = new Node(sum % 10);
            curr1 = curr1.next;
            curr2 = curr2.next;
            tail = tail.next;
            carry = sum / 10;
        }

        //  if some of the Node is exists
        while(curr1 != null){
            sum =  curr1.data + carry;
            tail.next = new Node (sum % 10);
            tail = tail.next;
            curr1 = curr1.next;
            carry = sum / 10;
        }

        while(curr2 != null){
            sum =  curr2.data + carry;
            tail.next = new Node (sum % 10);
            tail = tail.next;
            curr2 = curr2.next;
            carry = sum / 10;
        }

        while(carry != 0){
            tail.next = new Node(carry % 10);
            tail = tail.next;
            carry = carry / 10;
        }

        // Dummmy Node is Present in the final Linked List
        // So we remove it

        head = reverse(head.next, null);
        while(head.data == 0 && head.next != null){
            head = head.next;
        }

        return head;
    }
}
