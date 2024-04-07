package linkedlist;

public class LLPractice {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LLDemo{
        Node head = null;
        Node tail = null;

        // *************************************************** LL Insertion ********************************************
        void insertAtHead(int val){
            Node temp = new Node(val);

            if (head == null){
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val){
            Node temp = head;
            Node newNode = new Node(val);

            if (idx < 0){
                System.out.println("Wrong Index");
            }
            else if (idx > length()){
                System.out.println("Index cannot be greater than Linked list size");
                return;
            }
            else if (idx == 0){
                insertAtHead(val);
                return;
            }
            else if (idx == length()){
                insertAtEnd(val);
                return;
            }
            else {
                for (int i = 1; i <= idx-1 ; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }



        }

        void insertAtEnd(int val){
            Node t = head;
            Node temp = new Node(val);
            if (head == null){
                insertAtHead(val);
            }
            else {
              tail.next = temp;
              tail = temp;
            }
        }

        // ************************************************* LL Deletion ***********************************************
        void deleteAt(int idx){
            Node temp = head;

            if (temp != null){

                // if the LL contains only one item in a list
                if (temp.next == null){
                    head = null;
                }
                if (idx == 0){
                    head = head.next;
                }
                 // remove the last Node of the list
                else if (idx == length()-1) {
                    while (temp.next.next != null){
                        temp= temp.next;
                    }
                    temp.next = null;
                    tail = temp;
                }
                else {
                    for (int i = 1; i <= idx-1; i++) {
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }else {
                System.out.println("LL is Empty");
            }
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int length(){
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {

        LLDemo ll = new LLDemo();

        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);

        ll.display();

        ll.insertAtEnd(4);
        ll.display();

        ll.insertAt(2,7);
        ll.display();

        ll.insertAt(2,8);
        ll.display();

        ll.deleteAt(0);
        ll.display();

        ll.deleteAt(4);
        ll.display();

        ll.deleteAt(2);
        ll.display();

    }
}
