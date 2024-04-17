package linkedlist.singlyLL;

public class StandardImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;


// ========================================  Linked List Insertion ======================================================================

        // Inserting Node at Begging
        void insertAtBegging(int data) {
            Node temp = new Node(data);

            if (head == null) {   // List is Empty
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Inserting Node At Particular Index
        void insertAt(int idx, int data) {
            Node newNode = new Node(data);
            Node temp = head;
            if (idx < 0) {
                System.out.println("Index cannot be less than zero");
                return;
            } else if (idx > listSize()) {
                System.out.println("Index is Greater than the List size");
                return;
            } else if (idx == 0) {
                insertAtBegging(data);
                return;
            } else if (idx == listSize()) {
                insertAtEnd(data);
                return;
            } else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        //  Inserting Node At the End of the Linked List
        void insertAtEnd(int data) {
            Node temp = new Node(data);

            // Agar linked list empty hai or head ki value null hain us case mein tail ko head banado
            if (head == null)
                insertAtBegging(data);
            else
                tail.next = temp;
            tail = temp;
        }

// ========================================================================================================================================



        // ============================================== Deletion In Linked List =======================================================

        void deleteAt(int idx){
            Node temp = head ;
            if (idx == 0){
                head = head.next;
            }
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next ;
            }
            temp.next = temp.next.next;
            //  when we delete the last index then in that case tail should be equal to temp
            tail = temp;
            int size = listSize()-1 ;
        }



// ========================================================================================================================================
        //  Getting Data of the particular index
        void getData(int idx) {
            Node temp = head;
            if (idx < 0 || idx > listSize()) {
                System.out.println("Wrong Index");
                return;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }


        //  Displaying the Linked List
        void displayLL() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //  Displaying Length of the Linked List
        int listSize() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println();
            return count;
        }

    }

    public static void main(String[] args) {

        linkedList ll = new linkedList();
        ll.insertAtEnd(55);
        ll.insertAtEnd(66);
        ll.displayLL();
        ll.listSize();

        System.out.println("Insert Node at End");
        ll.insertAtEnd(12);
        ll.displayLL();

        System.out.println("Insert Node at the Beginning");
        ll.insertAtBegging(5);
        ll.displayLL();

        System.out.print("Inserting Node At Particular Index");
        ll.insertAt(0, 44);
        ll.displayLL();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);

        ll.insertAt(5, 440);
        ll.displayLL();

        ll.getData(3);
        ll.getData(-6);

        ll.deleteAt(3);
        ll.displayLL();

        ll.deleteAt(0);
        ll.displayLL();
    }
}
