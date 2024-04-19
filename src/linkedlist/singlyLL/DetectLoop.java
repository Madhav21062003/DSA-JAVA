package linkedlist.singlyLL;

public class DetectLoop {

    public class LinkedList {

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        static boolean detectLoop(Node head) {
            Node curr = head;
            java.util.HashMap<Node, Boolean> visited = new java.util.HashMap<>();

            // Traverse the Node
            while(curr != null) {
                if(visited.containsKey(curr) && visited.get(curr)) {
                    return true;
                }

                visited.put(curr, true);
                curr = curr.next;
            }
            return false;
        }

        public static void main(String[] args) {
            // Create a linked list with a loop
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next; // Creates a loop

            // Detect loop
            System.out.println("Loop detected: " + detectLoop(head));
        }
    }
}
