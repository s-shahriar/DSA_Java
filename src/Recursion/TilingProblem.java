package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n) {

        if(n==0 || n==1) return 1;

        // If 2x1 vertical tiles are chosen
        int verticalWays = tilingProblem(n-1);

        // If 2x1 horizontal tiles are chosen
        int horizontalWays = tilingProblem(n-2);

        return verticalWays + horizontalWays;
    }
    public static void main(String[] args) {
        int n = 3;
        int ans = tilingProblem(n);
        System.out.println("Provided Board Size : 2x" +n);
        System.out.println("Ways to Fill up the Board : " + ans);
    }
}

/*
          +-------------------+
          |     Start         |
          +-------------------+
                    |
                    v
        +-----------------------+
        | If n == 0 or n == 1?  |
        +-----------------------+
                    |
             Yes /       \ No
                /         \
        +-------+    +------------------+
        | Return |    | verticalWays =  |
        |    1   |    | tilingProblem(n-1) |
        +-------+    +------------------+
                          |
                          v
                +------------------+
                | horizontalWays =  |
                | tilingProblem(n-2) |
                +------------------+
                          |
                          v
              +------------------------+
              | Return verticalWays +   |
              | horizontalWays         |
              +------------------------+
                          |
                          v
                        End

 */