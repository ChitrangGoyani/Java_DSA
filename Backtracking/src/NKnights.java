public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board,0,0,4);
    }

    public static void knights(boolean[][] board, int row, int col, int target){
        if (target == 0){
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) // if column goes out of bounds
            return;

        if (col == board.length){
            knights(board,row+1,0,target);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            knights(board,row,col+1,target-1); // move forward in the same row
            board[row][col] = false;
        }
        knights(board,row,col+1,target); // move in the same row (knight not placed)

    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //knights movement restriction implemented
        // here knights cant move up because one knight wouldve already been placed above somewhere
        if (isValid(board,row-1,col-2)){
            if (board[row-1][col-2])
                return false;
        }
        if (isValid(board,row-2,col-1)){
            if (board[row-2][col-1])
                return false;
        }
        if (isValid(board,row-2,col+1)){
            if (board[row-2][col+1])
                return false;
        }
        if (isValid(board,row-1,col+2)){
            if (board[row-1][col+2])
                return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board,int row, int col){
        if (row < board.length && row >= 0 && col >= 0 && col < board.length)
            return true;
        return false;
    }
}
