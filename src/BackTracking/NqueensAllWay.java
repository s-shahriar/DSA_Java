package BackTracking;

public class NqueensAllWay {

    public static void nqueens(char[][] board, int row) {
        // base
        if(row == board.length){
            printBoard(board);
            return;
        }

        // column loop
        for(int j = 0; j < board.length; j++){
            if (isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueens(board,row+1);
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        // for Vertical up
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // for left diagonal up
        for(int i = row-1, j=col-1; i >=0 && j>= 0; i--, j--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // for right diagonal up
        for(int i = row-1, j=col+1; i >=0 && j< board.length; i--, j++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // otherwise, no problem
        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("--------Chess Board--------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");  // Print each cell
            }
            System.out.println();  // Move to the next row
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nqueens(board,0);
    }
}
