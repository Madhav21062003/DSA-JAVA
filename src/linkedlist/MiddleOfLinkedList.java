package linkedlist;

public class MiddleOfLinkedList {


    static class ListNode {
        int val;
        ReverseLinkedList.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ReverseLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode middleNode(ListNode head) {

            int count = 0;
            ListNode temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            count = count / 2;
            temp = head;
            while (count != 0) {
                temp = temp.next;
                count = count - 1;
            }

            return temp;
        }


    }

    public static void main(String[] args) {

    }
}
