package BackTracking;

public class GridWays {
    public static int gridWays(int row, int col, int n) {
        // Base
        // if target is reached
        if(row == n-1 && col == n-1) return 1;

        // if out of the maze
        if(row >=n || col >=n) return 0;

        // Go to Right
        int w1= gridWays(row, col+1, n);
        // Go to Down
        int w2= gridWays(row+1, col, n);

        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int ways = gridWays(0,0,n);
        System.out.println("Ways = " + ways);
    }
}
