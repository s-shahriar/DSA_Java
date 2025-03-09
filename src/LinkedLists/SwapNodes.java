package LinkedLists;

public class SwapNodes {

    // Definition for singly-linked list node
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Swap the k-th node from the start with the k-th node from the end
    public static Node swapNodes(Node head, int k) {
        Node curr = head;
        int count = 1;

        // Move curr to the k-th node from the start
        while (count < k) {
            curr = curr.next;
            count++;
        }

        Node a = curr;  // k-th node from the start
        Node b = head;  // another node start

        // Move curr to the end, and b will move to the k-th node from the end
        while (curr.next != null) {
            curr = curr.next;  // Move curr to the end
            b = b.next;        // Move b k nodes behind curr
        }

        // Swap the values of the k-th node from the start and the k-th node from the end
        int temp = a.val;
        a.val = b.val;
        b.val = temp;

        return head;
    }

    // Helper function to print the list
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main function to test the swapNodes method
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original List: ");
        printList(head);

        // Swap 2nd node from start with 2nd node from end
        head = swapNodes(head, 2);

        System.out.print("List after swap: ");
        printList(head);
    }
}
