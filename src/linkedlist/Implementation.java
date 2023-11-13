package linkedlist;

public class Implementation {

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        // elements in the linked list are 1 2 3 4 5
        a.next = b ;   // 1 -> 2
        b.next = c ;   // 1 -> 2 -> 3
        c.next = d ;   // 1 -> 2 -> 3 -> 4
        d.next = e ;   // 1 -> 2 -> 3 -> 4 -> 5

        System.out.println(a.data);   // 1
        System.out.println(a.next.data); // 1 -> 2
        System.out.println(a.next.next.data);  // 1 -> 2 -> 3
        System.out.println(a.next.next.next.data);  // 1 -> 2 -> 3 -> 4
        System.out.println(a.next.next.next.next.data); // 1 -> 2 -> 3 -> 4 -> 5

        printList(a);
        System.out.println();
        printListRecursively(a);
        System.out.println();
        reverseLL(a);
        System.out.println();
        int length = linkedListLength(a);
        System.out.println(length);
    }

    static void printList(Node head){
        Node temp = head ;
        if (head == null)
            return;

        else {
            while (temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next ;
                if (temp == null)
                    System.out.print("null");
            }
        }
    }

    // Printing the linked list recursively
    static void printListRecursively(Node head){
        if (head == null)
            return;
        Node temp  = head ;
         System.out.print(temp.data+" ");
        printListRecursively(temp.next);
    }

    // Print the Linked List in reverse Order
    static void reverseLL(Node head){
        if (head == null)
            return;

        reverseLL(head.next);
        System.out.print(head.data+" ");
    }

    // Length of a Linked List
    static int linkedListLength(Node head){
        int count = 0 ;
        while (head != null){
            count ++ ;
            head = head.next ;
        }
        return count;
    }


}
