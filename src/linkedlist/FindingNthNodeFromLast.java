package linkedlist;

public class FindingNthNodeFromLast {

    static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
        }
    }
    public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            Node f = new Node(60);

            a.next = b ;
            b.next = c ;
            c.next = d ;
            d.next = e;
            e.next = f;

            Node temp = nthNodeFromLast(a,5);

        System.out.println(temp.data);

        nthNodeFromLast2(a,6);

    }

    private static Node nthNodeFromLast(Node head, int n) {
            int size = 0 ;
            Node temp = head ;

            if (head == null)
                return null;

            if (head.next == null && n == 1)
                return null ;
            while (temp != null){
                size++;
                temp = temp.next;
            }


            int m = size - n + 1 ;
            // mth Node from start
        temp = head ;

        for (int i = 1; i <= m-1; i++) {
            temp = temp.next ;
        }
        return temp;
    }

    // Approach 2  find Nth node from Last in One traversal only

    public static  void nthNodeFromLast2(Node head, int n){
        Node slow = head;
        Node fast = head ;

        for (int i = 1; i <= n; i++) {
            fast = fast.next ;
        }

        while (fast!= null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("The Node is: "+slow.data);
    }
    public static void printList(Node head){
        Node temp = head ;

        while (temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
    }

}
