package LinkedLists;

public class MergeSort {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Function to find the middle of the linked list
    public static Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to sort the linked list using merge sort
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }


    // Function to print the linked list
    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main function to test the merge sort implementation
    public static void main(String[] args) {
        // Creating a sample linked list: 4 -> 2 -> 1 -> 3
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);

        // Sorting the linked list
        Node sortedHead = mergeSort(head);

        System.out.println("Sorted List:");
        printList(sortedHead);
    }
}
