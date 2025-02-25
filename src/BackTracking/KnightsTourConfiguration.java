package BackTracking;

public class KnightsTourConfiguration {
    public static boolean checkValidGrid(int[][] grid) {
        return solve(grid, grid.length, 0, 0, 0);
    }

    public static boolean solve(int[][] grid, int n, int i, int j, int expectedValue) {
        // base
        if(i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != expectedValue ) {
            return false;
        }

        if(expectedValue == (n*n -1)){
            return true;
        }


        boolean move1 = solve(grid, i-2, j+1, grid.length, expectedValue+1);
        boolean move2 = solve(grid, i-1, j+2, grid.length, expectedValue+1);
        boolean move3 = solve(grid, i+1, j+2, grid.length, expectedValue+1);
        boolean move4 = solve(grid, i+2, j+1, grid.length, expectedValue+1);
        boolean move5 = solve(grid, i+2, j-1, grid.length, expectedValue+1);
        boolean move6 = solve(grid, i+1, j-2, grid.length, expectedValue+1);
        boolean move7 = solve(grid, i-1, j-2, grid.length, expectedValue+1);
        boolean move8 = solve(grid, i-2, j-1, grid.length, expectedValue+1);

        return move1 || move2 || move3 || move4 || move5 || move6 || move7 || move8;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,3,6},{5,8,1},{2,7,4}};
        boolean ans = checkValidGrid(grid);
        System.out.println(ans);
    }
}
