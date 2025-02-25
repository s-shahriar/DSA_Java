package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static boolean isValid(int row, int col, int n, int[][] maze) {
        return row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1;
    }

    public static void solve(int row, int col, int[][] maze, int n, List<String> result, StringBuilder temp) {
        // Base
        // Check if invalid or not
        if(!isValid(row, col, n, maze)){
            return;
        }

        // If reached in target
        if(row == n-1 && col == n-1){
            result.add(temp.toString());
            return;
        }

        maze[row][col] = 0;

        // go down
        temp.append("D");
        solve(row+1, col, maze, n, result, temp);
        temp.deleteCharAt(temp.length()-1);

        // go left
        temp.append("L");
        solve(row, col-1, maze, n, result, temp);
        temp.deleteCharAt(temp.length()-1);

        // go up
        temp.append("U");
        solve(row-1, col, maze, n, result, temp);
        temp.deleteCharAt(temp.length()-1);

        // go right
        temp.append("R");
        solve(row, col+1, maze, n, result, temp);
        temp.deleteCharAt(temp.length()-1);

        maze[row][col] = 1;
    }

    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        solve(0,0,maze, maze.length, result,temp);
        System.out.println("Path is = " + result);
    }
}
