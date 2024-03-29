package linkedlist;

public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;  // 1->2
        b.next = c;  // 1 -> 2 -> 3
        c.next = d;  // 1 -> 2 -> 3 -> 4
        d.next = e;  // 1 -> 2 -> 3 -> 4 -> 5
        e.next = f;  // 1 -> 2 -> 3 -> 4 -> 5 -> 6

        displayList(a);
        System.out.println();
        displayListRecursively(a);
    }
    static void displayList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    static void displayListRecursively(Node head){
        if (head == null)
            return;

        System.out.print(head.data+" ");
        displayList(head.next);
        
    }
}
