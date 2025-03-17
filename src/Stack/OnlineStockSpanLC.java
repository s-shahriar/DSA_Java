package Stack;

import java.util.Stack;

public class OnlineStockSpanLC {
    public static Stack<int[]> st = new Stack<>();

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.peek()[1];
            st.pop();
        }

        st.push(new int[]{price, span});
        return span;
    }


    public static void main(String[] args) {
        OnlineStockSpanLC stockSpanner = new OnlineStockSpanLC();
        System.out.println(stockSpanner.next(100)); // Output: 1
        System.out.println(stockSpanner.next(80));  // Output: 1
        System.out.println(stockSpanner.next(60));  // Output: 1
        System.out.println(stockSpanner.next(70));  // Output: 2
        System.out.println(stockSpanner.next(60));  // Output: 1
        System.out.println(stockSpanner.next(75));  // Output: 4
        System.out.println(stockSpanner.next(85));  // Output: 6
    }
}
