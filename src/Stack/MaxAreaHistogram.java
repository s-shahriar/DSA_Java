package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int[] nsr = new int[height.length];
        int[] nsl = new int[height.length];

        // next smaller right
        Stack<Integer> stack = new Stack<>();
        for (int i = height.length-1; i >=0; i--) {
            int currValue = height[i];

            while (!stack.isEmpty() && height[stack.peek()] >= currValue) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = stack.peek();
            }

            stack.push(i);
        }

        // next smaller left
        stack = new Stack<>();
        for (int i = 0; i<height.length;i++) {
            int currValue = height[i];

            while (!stack.isEmpty() && height[stack.peek()] >= currValue) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }

            stack.push(i);
        }


        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = h * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        int ans = maxArea(height);
        System.out.println("Max Area: " + ans);
    }
}
