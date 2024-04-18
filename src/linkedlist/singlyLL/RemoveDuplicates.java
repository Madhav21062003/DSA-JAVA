package linkedlist.singlyLL;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    // Using Extra Space
    Node removeDuplicates1(Node head) {

        List<Integer> ans = new ArrayList<>();
        Node temp = head;
        Node curr = temp.next;

        ans.add(head.data);

        while (curr != null) {

            // Duplicate nahin mila
            if (ans.get(ans.size() - 1) != curr.data)
                    ans.add(curr.data);

            curr = curr.next;
        }

        curr = head;
        int index = 0;
        Node prev = null;
        while (index < ans.size()){
            curr.data = ans.get(index);
            index++;
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;

        return head;
    }

    // Optimized approach
    Node removeDuplicates(Node head) {
        Node temp = head;
        Node curr = temp.next;
        Node prev = temp;

        while (curr != null) {

            if (curr.data == prev.data) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }

        return head;
    }

}
