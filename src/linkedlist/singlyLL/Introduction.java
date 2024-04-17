package linkedlist.singlyLL;

public class Introduction {

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
        System.out.println();

        lengthOfLL(a);
    }
    static void displayList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    static void displayListRecursively(Node head){
        if (head == null) return;

        displayListRecursively(head.next);
        System.out.print(head.data+" ");
    }

    static void lengthOfLL(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        System.out.println("Length of Linked List = "+count);
    }
}
