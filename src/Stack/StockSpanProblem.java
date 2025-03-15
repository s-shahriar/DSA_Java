package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int[] stocks, int[] spans) {
        Stack<Integer> stack = new Stack<>();
        spans[0] = 1;
        stack.push(0);

        for (int i = 0; i < stocks.length; i++) {
            int currentPrice = stocks[i];

            while(!stack.isEmpty() && currentPrice >= stocks[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                spans[i] = i+1;
            } else {
                int prevHigh = stack.peek();
                spans[i] = i - prevHigh;
            }

            stack.push(i);
        }

    }

    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int[] spans = new int[stocks.length];
        stockSpan(stocks,spans);
        System.out.println("Result = " + Arrays.toString(spans));
    }
}
