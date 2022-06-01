public class SudokuSolver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board))
            display(board);
        else
            System.out.println("Cannot solve");

    }

    static boolean solve(int[][] board){
        /**
        * In this function we check 4 things
        * 1. Check for empty cell by iterating over the matrix
        * 2. Store empty cell values in row and col variables
        * 3. Call isSafe using nos [1-9]
        * 4. Recurse the same function if the sudoku is not solved
        */

        int n = board.length; // this gives the length of the board
        int row = -1;
        int col = -1;
        boolean emptyLeft = false; // Are there empty cells left ?

        //Lets iterate over the sudoku board to find an empty cell

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(board[i][j] == 0) // if cell is empty
                {
                    row = i; // store row and col values of empty cell
                    col = j;
                    emptyLeft = true; // mark found an empty cell
                    break; // break out from current loop cuz you found an empty cell, time to test values for it
                }
            }
            if(emptyLeft == true)
                break; // break out of outer loop also because you found an empty cell
        }
        if(emptyLeft == false)
            return true; // this means sudoku is solved because no empty cells

        //Now we come to testing every number from [1-9] for the cell and calling isSafe to check

        for(int number = 1; number <= 9; number ++){ // for every no from 1-9
            if(isSafe(board,row,col,number)) // if it is safe
            {
                board[row][col] = number;
                // now check if board is solved
                if(solve(board))
                    return true; // if it is solved
                else
                    // BACKTRACK
                    board[row][col] = 0; // mark it empty (backtrack)
            }
        }
        return false; // if the sudoku cannot be solved
    }

    static boolean isSafe(int[][] board, int row, int col, int num){

        /**
         * In this function we check the eligibility of values that can be placed in a sudoku cell
         * 1. We check the entire row in question
         * 2. We check the entire col in question
         * 3. We check the entire subgrid in question
         */

        // lets check the entire row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num) // if any cell in the row (i = 1 -> board.length) equals the number
                return false; // We cannot place that number
        }

        // lets check the entire coln
        for(int[] nums : board){ // for every cell in a particular coln
            if(nums[col] == num) // if the number in that coln
                return false; // We cannot place that number
        }

        //now lets check the subgrid
        // lets use the formula to check starting cell of the subgrid where (row,col) belongs

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - (row%sqrt);
        int colStart = col - (col%sqrt);

        for(int r = rowStart; r < rowStart+sqrt; r++){ // rowStart+sqrt is basically the boundary of the subgrid row
            for(int c = colStart; c < colStart+sqrt; c++){ // colStart+sqrt is basically the boundary of the col
                if(board[r][c] == num) // if a cell in a subgrid has that number
                    return false; //We cannot place that number
            }
        }
        return true; // If all above dont get triggered its safe to place the number
    }

    static void display(int[][] board){
        for(int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
