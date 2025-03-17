package Stack;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] tokens = path.split("/");

        for (String token : tokens) {
            if (token.isEmpty() || token.equals(".")) {
                continue; // Ignore empty parts and "."
            }

            if(!token.equals("..")) {
                stack.push(token);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()) {
            result.insert(0, "/"+ stack.pop());
        }

        return result.length() == 0 ? "/" : result.toString();

    }
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        String ans = simplifyPath(path);
        System.out.println("Ans : " + ans);
    }
}
