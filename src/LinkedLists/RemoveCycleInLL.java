package LinkedLists;

public class RemoveCycleInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void removeCycle(Node head) {
        boolean cycle = false;
        Node slow = head;
        Node fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                cycle = true;
                break;
            }
        }

        if (!cycle) return; // No cycle, return

        // Reset slow to head and find the node before the cycle starts
        slow = head;
        Node prev = null; // To track the last node before the cycle

        while (slow != fast) {
            prev = fast; // Track last node before cycle starts
            slow = slow.next;
            fast = fast.next;
        }

        // Breaking the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Creating a cycle (4 -> 2)
        head.next.next.next.next = head.next;

        // Removing cycle
        removeCycle(head);

        // Printing the list (should print: 1 2 3 4)
        printList(head);
    }
}
