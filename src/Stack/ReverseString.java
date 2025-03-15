package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb);
    }
}
