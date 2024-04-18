package linkedlist.singlyLL;

public class Sort012s {

    private static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static void main(String[] args) {

    }

    static Node segregate(Node head)
    {
        Node curr = head;

        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        // count number of 0,1,2 in  alist
        while(curr != null){

            if(curr.data == 0)
                count_0++;

            else if(curr.data == 1)
                count_1++;

            else
                count_2++;

            curr = curr.next;
        }

        curr = head;

        while(count_0 != 0){
            curr.data = 0;
            curr = curr.next;
            count_0--;
        }

        while(count_1 != 0){
            curr.data = 1;
            curr = curr.next;
            count_1--;
        }

        while(count_2 != 0){
            curr.data = 2;
            curr = curr.next;
            count_2--;
        }

        return head;

    }
}
