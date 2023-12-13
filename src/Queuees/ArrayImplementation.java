package Queuees;

public class ArrayImplementation {

    public static class QueueArray{
        int front = -1;
        int rear = -1;
        int arr[] = new int[100];
        int size = 0;
        public void add(int val){
            if (rear == arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            else {
                if (front == -1)
                {
                    front = rear = 0;
                    arr[0] = val;
                }
                else
                {
                    arr[rear + 1] = val;
                    rear++;
                }
                size++;
            }
        }

        public  int remove(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty(){
            if (size == 0)
                return true;

            else
                return false;
        }

        public void disPlay(){
            if (size == 0){
                System.out.println("Queue is Empty");
            }
            else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        QueueArray queue = new QueueArray();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.disPlay();

        queue.remove();
        queue.disPlay();
        System.out.println(queue.peek());
        System.out.println(queue.size);

    }
}
