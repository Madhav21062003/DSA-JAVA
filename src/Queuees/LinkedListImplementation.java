package Queuees;

public class LinkedListImplementation {

    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLinkedList{
        Node head = null;
        Node tail = null;
        int size = 0 ;

        public void add(int x){
            Node temp = new Node(x);
            if (size == 0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }

            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display(){

            if (size == 0){
                System.out.println("Queue is Empty!!");
                return;
            }
            Node temp = head;

            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if (size == 0)
                return true;

            else
                return false;
        }
    }
    public static void main(String[] args) {

        QueueLinkedList queue = new QueueLinkedList();

        System.out.println(queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.isEmpty());

        queue.add(4);
        queue.add(5);
        queue.display();

        System.out.println(queue.peek());

        queue.remove();
        queue.display();
    }
}
