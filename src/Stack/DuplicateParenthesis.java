package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ')'){
                int count = 0;
                while(stack.peek() != '('){
                    count++;
                    stack.pop();
                }
                if(count < 1){
                    return true;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String s = "(((a+b)+(c+d)))";
        boolean result = isDuplicate(s);
        System.out.println(result);
    }
}
