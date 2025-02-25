package BackTracking;

public class SudokuSolver {

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static boolean isSafe(int row, int col, char[][] board, char digit){

        for(int i=0; i<9; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        for(int j=0; j<9; j++){
            if(board[row][j] == digit){
                return false;
            }
        }

        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }


        return true;
    }

    public static boolean solve(char[][] board, int row, int col){

        if(row == 9){
            return true;
        }

        int nextRow = row;
        int nextCol = col+1;

        if(col == 8){
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != '.'){
            return solve(board, nextRow, nextCol);
        }

        for(char digit = '1' ; digit<='9'; digit++){
            if(isSafe(row,col,board,digit)){
                board[row][col] = digit;
                // then check if placing a digit here, will be correct or not
                if(solve(board, nextRow, nextCol)){
                    return true;
                }

                board[row][col] = '.';
            }
        }

        return false;
    }


    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
        printBoard(board);
    }

}
