package LinkedLists;

public class FindMiddleOfLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLinkedList(head);

        Node middle = middleNode(head);
        System.out.print("Middle of Linked List: ");
        printLinkedList(middle);

        // Another test with an even-length list
        head.next.next.next.next.next = new Node(6);

        middle = middleNode(head);
        System.out.print("Middle of Updated Linked List: ");
        printLinkedList(middle);
    }
}
