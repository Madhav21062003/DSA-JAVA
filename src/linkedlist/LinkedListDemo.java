package linkedlist;

public class LinkedListDemo {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtHead(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        void insertAtPosition(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx < 0){
                System.out.println("Index cannot be less than zero");
                return;
            }
            else if (idx > length()){
                System.out.println("Index cannot be greater than Linked list size");
                return;
            }
            else if (idx == length()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }


        }

        void insertAtEnd(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void deleteAt(int idx){
            Node temp = head;
            if (idx == 0 ) {
                head = head.next;
            }
            else if (idx == length() - 1) {
                // Traverse to the second last node
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                // Remove the last node
                temp.next = null;
                tail = temp;
            }
            else {
                for (int i=1; i<=idx-1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

        }

        void getAt(int idx){
            if (idx < 0 || idx > length()) {
                System.out.println("wrong Index");
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        void display() {
            Node temp = head;
            if (head == null) {
                System.out.println("List is empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

        void size() {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println(count);
        }

        int length() {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();
        ll.size();
        ll.insertAtEnd(12);
        ll.display();
        ll.size();

        ll.insertAtHead(3);
        ll.display();
        ll.size();

        ll.insertAtPosition(3, 6);
        ll.display();
        System.out.println(ll.tail.data);

        ll.getAt(2);
        ll.deleteAt(2);
        ll.display();
        System.out.println(ll.tail.data);
        ll.deleteAt(3);
        ll.size();
        ll.display();
        System.out.println(ll.tail.data);



    }
}
