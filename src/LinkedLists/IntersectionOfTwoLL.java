package LinkedLists;

public class IntersectionOfTwoLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getSize(headA);
        int lenB = getSize(headB);

        // Move the longer list ahead by the difference in lengths
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Traverse both lists together until we find the intersection node
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // This will be the intersection node (or null if no intersection)
    }

    // Function to compute the size of a linked list
    public static int getSize(Node head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }

    // Helper function to print a linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating two linked lists
        // List A: 1 -> 2 -> 3 -> 6 -> 7 -> 8
        // List B:      4 -> 5 ↘
        //                     6 -> 7 -> 8 (Intersection starts from node 6)

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);

        Node headB = new Node(4);
        headB.next = new Node(5);

        // Common intersection part
        Node common = new Node(6);
        common.next = new Node(7);
        common.next.next = new Node(8);

        // Connecting the common part to both lists
        headA.next.next.next = common; // 3 -> 6
        headB.next.next = common;      // 5 -> 6

        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        // Find intersection
        Node intersectionNode = getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection at Node with value: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
