import java.util.List;
import java.util.ArrayList;

// T.C-> O(n^n)
public class NQueens {
     public static List<List<String>> solvequeens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
     public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveboard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '_';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // horizontally
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // vertically
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        // upper left
        for (int c = col, r = row; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        for (int c = col, r = row; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        for (int c = col, r = row; r < board.length && c >= 0; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int c = col, r = row; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void saveboard(char[][] board,List<List<String>> allBoards){
        String row="";
        List<String> newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+="*";
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
    }
    public static void main(String args[]) {
System.out.println(solvequeens(4));
    }
}
