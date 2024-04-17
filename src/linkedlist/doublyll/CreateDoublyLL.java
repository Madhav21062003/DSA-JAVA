package linkedlist.doublyll;

public class CreateDoublyLL {

    private static class Node  {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Node head = null;
        Node tail = null;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (head == null){
//                head = new Node(arr[i]);
//                tail = head;
//            }
//            else  {
//                Node temp = new Node(arr[i]);
//                tail.next = temp;
//                temp.prev = tail;
//                tail = temp;
//            }
//        }
//
        head = createDLL(arr, 0,arr.length , null);
        Node trav = head;

        while (trav != null){
            System.out.print(trav.data+" ");
            trav = trav.next;
        }



    }

    private static Node createDLL(int[] arr, int idx, int size, Node back) {

        if (idx == size){
            return null;
        }
        Node temp = new Node(arr[idx]);
        temp.prev = back;
        temp.next = createDLL(arr,idx+1,size,temp);

        return temp;
    }


}
