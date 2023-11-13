package linkedlist.doublyll;

public class DoublyLL {
    public static class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    // Solution of Q-1
    static void qOne(Node random){
        Node temp = random;

        while (temp.prev != null){
            temp = temp.prev;
        }

        // now temp is on head position
        // now simply display the list
        displayDoublyLL(temp);
    }
    public static void displayDoublyLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t ;
        return  head;
    }

    public static void insertAtTail(Node head, int x){
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIdx(Node head, int idx, int x){
        Node s = head;
        for (int i = 1; i < idx-1; i++) {
            s = s.next;
        }

        // s is at idx - 1 position
        Node r = s.next;
        Node t = new Node(x);

        // s t r
        s.next = t ;
        t.prev = s ;
        t.next = r ;
        r.prev = t ;
    }
    public static void main(String[] args) {

        Node a  = new Node(4);
        Node b  = new Node(10);
        Node c  = new Node(2);
        Node d =  new Node(99);
        Node e = new Node(13);
        // list -> 4 10 2 99 13
        a.prev = null ;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

//        System.out.println(e.prev.val);
        displayDoublyLL(a);

        // Q-1  WAP in JAVA print a list from starting node in every case , user wil;l provide any node to you
        System.out.println("Solution of Question - 1");
        qOne(e);

        Node newNode = insertAtHead(a, 38);
        displayDoublyLL(newNode);

        insertAtTail(a, 77);
        displayDoublyLL(newNode);

        insertAtIdx(a, 2,11);
        displayDoublyLL(newNode);
    }



}
