package LinkedLists;

public class ReverseLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return prev;
    }


    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printLinkedList(head);
        System.out.println("Reversed Linked List");
        Node reversed = reverseLL(head);
        printLinkedList(reversed);
    }
}
