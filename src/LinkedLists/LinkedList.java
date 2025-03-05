package LinkedLists;

public class LinkedList {

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
    public static int size;

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp=temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() {
        if(size == 0) {
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int i = 0;
        Node prev = head;
        while(i < size-2){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int findElementByIndex(int index) {
        if (index >= size || index < 0) return -1;

        Node temp = head;
        int i = 0;
        while(i<index) {
            temp = temp.next;
            i++;
        }

        return temp.data;
    }

    public int removeNthFromEnd(int n){
        // learn to calculate size (already calculated via size here)
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        // if the n is the first element from the last -> that means the first element
        if(n == sz){
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // else for every other case
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }


    public int itSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void addAtIndex(int index, int data) {
        if (index > size || index < 0) return;

        if(index==0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;

        while(i < index-1){
            temp=temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // update tail
        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;

        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0) tail = null;  // If list is empty, reset tail
            return;
        }

        Node prev = head;
        int i = 0;

        while (i < index - 1) {
            if (prev == null) return;  // Prevents NullPointerException
            prev = prev.next;
            i++;
        }

        if (prev == null || prev.next == null) return;  // Double-check `prev` before accessing `prev.next`

        if (prev.next == tail) {  // If last node is deleted, update tail
            tail = prev;
        }

        prev.next = prev.next.next;  // Safe deletion
        size--;
    }



    public int helper(Node head, int key){
        if(head==null) return -1;
        if(head.data==key) return 0;

        int idx = helper(head.next, key);
        if(idx == -1) return -1;

        return idx+1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(11);
        ll.print();
        ll.add(2,7);
        ll.print();
        ll.addAtIndex(2, 11);
        ll.print();
        int index = ll.findElementByIndex(2);
        System.out.println("Element at 2nd index = " + index);
        ll.deleteAtIndex(2);
        System.out.print("After removing at 2nd Index = ");
        ll.print();
        int removeFirst = ll.removeFirst();
        System.out.println("removeFirst = " + removeFirst);
        ll.print();
        int removeLast = ll.removeLast();
        System.out.println("removeLast = " + removeLast);
        ll.print();
        int removeFromIdx = 2;
        int removeNthFromEnd = ll.removeNthFromEnd(2);
        System.out.println("remove " +removeFromIdx+ " NthFromEnd = " + removeNthFromEnd);
        ll.print();
        int itSearch = ll.itSearch(7);
        System.out.println("Iterative Search = " + itSearch);
        ll.print();
        int recSearch = ll.recursiveSearch(4);
        System.out.println("recursive Search = " + recSearch);
        System.out.println("LL Size = " + size);
    }
}
