package LinkedLists;

public class SkipMDeleteN {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void skipMDeleteN(Node head, int M, int N) {
        Node curr = head;

        while (curr != null) {
            // First, skip M nodes
            int count = 1;
            while (count < M && curr != null) {
                curr = curr.next;
                count++;
            }

            // If we reach the end, stop processing
            if (curr == null) return;

            // Start deleting N nodes
            Node t = curr.next;
            count = 0; // Start from 0 to delete exactly N nodes
            while (count < N && t != null) {
                t = t.next;
                count++;
            }

            // Link the skipped part to the remaining list
            curr.next = t;
            curr = t; // Move current to t to continue the process
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Example main to test the function
    public static void main(String[] args) {
        // Create a simple list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        printList(head);

        skipMDeleteN(head, 2, 3); // Skip 2, delete 3
        System.out.println("After skipping 2 and deleting 3:");
        printList(head);
    }
}
