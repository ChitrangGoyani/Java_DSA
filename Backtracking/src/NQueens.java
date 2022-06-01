public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nqueens(board,0));
    }

    public static int nqueens(boolean[][] board, int row){
        // if you have reached last row and placed all queens then program is done
        if(row == board.length){
            display(board); // just display the board
            System.out.println();
            return 1;
        }

        int ways = 0; // no of ways for solution

        for (int col = 0; col < board.length; col++){
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                ways += nqueens(board,row+1); // this row is done, now move to the next row
                // each time this function ends we have found a way
                board[row][col] = false; // okay now reset this node because we might need it for more number of ways in the future.
            }
        }
        return ways;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){

        // if the Q wants to move up in the same column, lets check if it can
        // if that particular cell on board is occupied i.e. true, vertical check returns false
        for (int i = 0; i < row; i++){
            if(board[i][col])
                return false;
        }
        //if the Q wants to move diagonal right, lets check if it can
        for(int i = 1; i <= Math.min(row,board.length-col-1); i++){
            if(board[row-i][col+i])
                return false;
        }
        //if the Q wants to move diagonal left, lets check if it can
        for(int i = 1; i <= Math.min(row,col); i++){
            if(board[row-i][col-i])
                return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
