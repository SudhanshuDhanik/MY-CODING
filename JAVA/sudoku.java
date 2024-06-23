public class sudoku {
    public static boolean solveSudoku(int[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newrow = 0, newcol = 0;
        if (col != board.length - 1) {
            newrow = row;
            newcol = col + 1;
        } else {
            newrow = row + 1;
            newcol = 0;
        }
        if (board[row][col] != 0) {
            if (solveSudoku(board, newrow, newcol)) {
                return true;
            }
        } else {
            for (int i = 1; i <=9; i++) {
                if (safeboard(board, row, col, i)) {
                    board[row][col] = i;
                    if (solveSudoku(board, newrow, newcol)) {
                        return true;
                    } else {
                        board[row][col] = 0;
                    }
                }
            }
        }
        return false;
    }

    static boolean safeboard(int[][] board, int row, int col, int no) {
        // row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == no) {
                return false;
            }
            if (board[row][i] == no) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == no)
                    return false;
            }
        }
        return true;

    }

    static void printSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (solveSudoku(board, 0, 0)) {
            printSudoku(board);
        }
        else
        System.out.println("no solution");
    }
}