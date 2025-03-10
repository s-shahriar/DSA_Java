package LinkedLists;

public class MergeKSortedLists {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node partitionAndMerge(int start, int end, Node[] lists) {
        if (start == end) {
            return lists[start]; // Base case: only one list, return it
        }

        int mid = start + (end - start) / 2; // Find the middle index

        Node L1 = partitionAndMerge(start, mid, lists); // Recursively merge left half
        Node L2 = partitionAndMerge(mid + 1, end, lists); // Recursively merge right half

        return mergeTwoSortedLists(L1, L2); // Merge two halves
    }


    public static Node mergeTwoSortedLists(Node l1, Node l2) {
        if (l1 == null) return l2; // If first list is empty, return second list
        if (l2 == null) return l1; // If second list is empty, return first list

        if (l1.val <= l2.val) { // If l1 has a smaller value, link it to merged result
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else { // Otherwise, link l2 to merged result
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }


    public static Node mergeKLists(Node[] lists) {
        int k = lists.length;
        if (k == 0) {
            return null; // If no lists, return null
        }
        return partitionAndMerge(0, k - 1, lists); // Recursively merge all lists
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        // Creating test case with 3 sorted linked lists
        Node[] lists = new Node[3];

        lists[0] = new Node(1);
        lists[0].next = new Node(4);
        lists[0].next.next = new Node(7);

        lists[1] = new Node(2);
        lists[1].next = new Node(5);
        lists[1].next.next = new Node(8);

        lists[2] = new Node(3);
        lists[2].next = new Node(6);
        lists[2].next.next = new Node(9);

        // Merging all sorted lists
        Node mergedHead = mergeKLists(lists);

        // Printing the merged sorted linked list
        printList(mergedHead);
    }

}
