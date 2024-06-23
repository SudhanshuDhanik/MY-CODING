import java.util.ArrayList;
import java.util.List;

public class NKnights {
    static List<List<String>> NQueens(int n) {
        List<List<String>> AllCombination = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, AllCombination, 0);
        return AllCombination;
    }

    static void helper(char[][] board, List<List<String>> AllCombination, int col) {
        if (col == board.length) {
            saveBoard(board, AllCombination);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'K';
                helper(board, AllCombination, col+1);
                board[row][col] = '_';
            }
        }
    }
    static boolean isValid(char[][] board,int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }
    static boolean isSafe(char[][] board,int row,int col){
          if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]=='K')
            return false;
          }
          if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]=='K')
            return false;
          } if(isValid(board, row-1  , col+2)){
            if(board[row-1][col+2]=='K')
            return false;
          } if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]=='K')
            return false;
          }
        return true;
    }
    static void saveBoard(char[][] board,List<List<String>> AllCombination){
        List<String> newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row="";
            for(int j=0;j<board.length;j++){
            if(board[i][j]=='K'){
                row+='K';
            }
            else row+='_';
        }
    newboard.add(row);}
    AllCombination.add(newboard);
    }

    public static void main(String[] args) {
        System.out.println(NQueens(4));
    }
}
