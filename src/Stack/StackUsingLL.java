package Stack;

public class StackUsingLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {

        public static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int val){
            Node newNode = new Node(val);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int ans = stack.peek();
        System.out.println(ans);
        stack.pop();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
