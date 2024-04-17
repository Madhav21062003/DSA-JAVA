package linkedlist.doublyll;

public class Implementation {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    public static void main(String[] args) {

        Node head = null;

        // Insert at start


        // If LinkedList doesn't exist
        if (head == null){
            head  = new Node(5);
        }

        // Already List
        else {
            Node temp = new Node(5);
            temp.next = head;
            temp.prev = temp;
            head = temp;
        }

        Node trav = head;
        while (trav != null){
            System.out.print(trav.data+" ");
            trav = trav.next;
        }

    }


}
