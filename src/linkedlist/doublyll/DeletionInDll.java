package linkedlist.doublyll;

import javax.swing.plaf.InsetsUIResource;

public class DeletionInDll {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Node head = null;

        head = createDLL(arr, 0, arr.length, null);
        Node trav = head;

        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();

        // ====================================================== Delete at head ==================================================
        if (head != null) {

            // Only one Node exists

            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                temp = temp.next;

                head = temp;
            }
        }

        trav = head;

        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();


        // =============================================  Delete at End =======================================================

        if (head != null) {
            // If only one node exists
            if (head.next == null) {
                head = null;
            }
            // more than One node exists
            else {
                Node curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.prev.next = null;
            }
        }
        trav = head;

        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();


        // ============================== Delete at Given Position ============================================

        int pos = 7;
        // case - 1 Delete at Pos
        if (pos == 1){
            if (head.next == null){
                head = null;
            }
            // If more than 1 node exists
            else {
                Node temp = head;
                head = head.next;
                head.prev = null;
            }
        }
        else{
            // delete at end or middle
            Node curr = head;
            while (pos != 0){
                curr = curr.next;
                pos = pos -1;
            }

            // Delete at end
            if (curr.next == null){
                curr.prev.next = null;
            }

            // Delete at middle
            else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
        }
        trav = head;

        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();




    }

    private static Node createDLL(int[] arr, int idx, int size, Node back) {

        if (idx == size) {
            return null;
        }
        Node temp = new Node(arr[idx]);
        temp.prev = back;
        temp.next = createDLL(arr, idx + 1, size, temp);

        return temp;
    }
}
