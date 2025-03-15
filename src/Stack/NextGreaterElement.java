package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr, int[] nextGreater) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            int currentValue = arr[i];

            while(!stack.isEmpty() && currentValue >= arr[stack.peek()]) {
                stack.pop();
            }

            if(stack.isEmpty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = new int[arr.length];
        int[] res = nextGreaterElement(arr, nextGreater);
        System.out.println("Main Array = " + Arrays.toString(arr));
        System.out.println("Next Greater Elements = " + Arrays.toString(res));
    }
}
