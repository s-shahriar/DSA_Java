package BackTracking;

public class NqueensCountLC {

    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];

        // Initialize the board with 'x' to represent empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';  // Set empty cells as 'x'
            }
        }

        // Start the backtracking process to count valid solutions
        return nqueens(board, 0);
    }

    private static int nqueens(char[][] board, int row) {
        // Base case: If all queens are placed, count this solution
        if (row == board.length) {
            return 1;  // A valid solution is found
        }

        int count = 0;  // Counter for number of solutions

        // Try placing a queen in every column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {  // Check if placing queen at (row, j) is safe
                board[row][j] = 'Q';  // Place queen
                count += nqueens(board, row + 1);  // Recur and accumulate valid solutions
                board[row][j] = 'x';  // Backtrack: Remove the queen
            }
        }

        return count;  // Return the number of valid solutions from this path
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
        int result = totalNQueens(n);
        System.out.println("Total solutions for " + n + "-Queens: " + result);
    }

}
