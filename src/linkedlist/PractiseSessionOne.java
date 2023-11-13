package linkedlist;

public class PractiseSessionOne {

    public static class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }
    public static class LinkedList{
        Node head = null ;
        Node tail = null ;

        // Insert Node at Start
        void insertAtStart(int data){
            Node temp = new Node(data);

            if (head == null){
                head = tail = temp ;
            }
            else {
                temp.next = head ;
                head = temp ;
            }
        }

        //  Insert Node at Particular Index in a Linked List
        void insertAt(int idx, int data){
            Node newNode = new Node(data);
            Node temp = head ;

            if (head == null || idx == 0)
                insertAtStart(data);

            else if (idx < 0) {
                System.out.println("Wrong Index");
            }
            else {
                for (int i = 1; i <= idx-1; i++) {
                    temp = temp.next ;
                }
                newNode.next = temp.next ;
                temp.next = newNode;
            }
        }

        // Insert Node at the end of the Linked List
        void insertAtEnd(int data){
            Node temp = new Node(data);

            if (head == null){
                insertAtStart(data);
            }
            else
                tail.next = temp ;
            tail = temp ;
        }

        // Delete Node in Linked List at any Index
        void deleteAt(int idx){
            Node temp = head ;

            if (idx == 0){
                head = head.next;
            }
            for (int i = 1; i <= idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            // when we delete a Node the Lat indx in that case tail should be equal to temp
            tail = temp;
        }
        // Getting Length of the Linked List
        int listSize(){
            Node temp = head ;
            int count = 0 ;
            while (temp != null){
                count++ ;
                temp = temp.next ;
            }
            return count;
        }

        // Displaying a Linked List
        void displayLL(){
            Node temp = head ;

            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println("Inserting Node at Starting");
        ll.insertAtStart(10);
        ll.displayLL();

        System.out.println("Inserting Node at End");
        ll.insertAtEnd(20);
        ll.displayLL();

        System.out.println("Inserting Node at Particular Index");
        ll.insertAt(1,12);
        ll.displayLL();

        System.out.println("Deleting Node at Particular Index");
        ll.deleteAt(0);
        ll.displayLL();

        System.out.println("Size of the Linked List is = "+     ll.listSize());

        System.out.println("Displaying the Linked List");
        ll.displayLL();


    }
}
