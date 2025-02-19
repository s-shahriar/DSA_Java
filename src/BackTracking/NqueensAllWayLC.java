package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NqueensAllWayLC {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with 'x' to represent empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';  // Set empty cells as 'x'
            }
        }

        // Start the backtracking process to find all solutions
        nqueens(board, 0, result);

        return result;
    }

    private static void nqueens(char[][] board, int row, List<List<String>> result) {
        // Base case: If all queens are placed
        if (row == board.length) {
            result.add(constructSolution(board));  // Add the current solution to the result list
            return;
        }

        // Try placing a queen in every column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {  // Check if placing queen at (row, j) is safe
                board[row][j] = 'Q';  // Place queen
                nqueens(board, row + 1, result);  // Recursively place queens in the next row
                board[row][j] = 'x';  // Backtrack: Remove the queen
            }
        }
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j] == 'Q' ? 'Q' : '.');  // Convert board row to a string
            }
            solution.add(sb.toString());
        }
        return solution;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical column (upwards direction)
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') { // If a queen is found in the same column
                return false;
            }
        }

        // Check left diagonal (upwards direction)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') { // If a queen is found in the left diagonal
                return false;
            }
        }

        // Check right diagonal (upwards direction)
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') { // If a queen is found in the right diagonal
                return false;
            }
        }

        // No threats found, so placing the queen is safe
        return true;
    }



    public static void main(String[] args) {
        int n = 4;  // Define the size of the board (4x4)
        List<List<String>> result = solveNQueens(n);
        System.out.println(result);
    }
}
