package Stack;

import java.util.Stack;

public class PushAtTheBottom {

    public static void printStack(Stack<Integer> stack) {
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void pushAtBottom(Stack<Integer> stack, int num) {
        if(stack.isEmpty()) {
            stack.push(num);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, num);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack,4);
        printStack(stack);
    }
}
