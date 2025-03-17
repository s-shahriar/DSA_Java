package Stack;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> stNum = new Stack<>();
        Stack<String> stStr = new Stack<>();

        int currNum = 0;
        StringBuilder currStr = new StringBuilder();

        for(char ch : s.toCharArray()) {

            if(ch == '['){
                stNum.push(currNum);
                stStr.push(currStr.toString());
                currNum = 0;
                currStr = new StringBuilder();
            } else if (ch == ']'){
                int num = stNum.pop();
                StringBuilder prevStr = new StringBuilder(stStr.pop());
                String s1 = currStr.toString();
                prevStr.append(s1.repeat(num));
                currStr = prevStr;
            } else if (ch >= '0' && ch <= '9'){
                currNum = currNum * 10 + ch - '0';
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }

    public static void main(String[] args) {
        String path = "3[a]2[bc]";
        String ans = decodeString(path);
        System.out.println("Decoded String = " + ans);
    }
}
