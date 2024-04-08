package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        // Reverse each Node of the linked list
        public ListNode reverseList(ListNode head) {
            List<Integer> ans = new LinkedList<>();
            ListNode curr = head, prev = null, fut = null;

            while (curr != null) {
                fut = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fut;
            }
            head = prev;

            return head;
        }


        // reverse data of each Node
        public ListNode reverseListData(ListNode head) {
            List<Integer> ans = new LinkedList<>();
            ListNode temp = head;
            while (temp != null) {
                ans.add(temp.val);
                temp = temp.next;
            }

            int i = ans.size() - 1;
            temp = head;

            while (temp != null) {
                temp.val = ans.get(i);
                i--;
                temp = temp.next;
            }

            return head;
        }

        // recursive Approach
        public ListNode reverseListRec(ListNode head) {

            return reverse(head, null);
        }

        ListNode reverse(ListNode curr, ListNode prev) {
            if (curr == null) {
                return prev;
            }

            ListNode fut = curr.next;
            curr.next = prev;

            return reverse(fut, curr);
        }
    }

    public static void main(String[] args) {

    }


}
