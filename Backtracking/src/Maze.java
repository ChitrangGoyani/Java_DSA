import java.sql.Array;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        simpleMaze("",3,3);
//        System.out.println();
//        diagonalMaze("",3,3);
//        System.out.println();
//        boolean[][] obstacles = new boolean[3][3];
//        boolean[][] obstacles = new boolean[][]{
//                {true,true,true,true},
//                {true,true,false,true},
//                {true,true,false,true},
//                {true,true,true,true}};
//        mazeWithObstacles(obstacles, "",3,3);
        boolean[][] maze = new boolean[][]{
                {true,true,true},
                {true,true,true},
                {true,true,true}};
        int[][] path = new int[maze.length][maze[0].length];
        allDirBacktracking(maze,"",path,1,0,0);
    }

    public static void simpleMaze(String p,int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
        }

        if (row > 1)
            simpleMaze(p + "D",row-1,col);
        if (col > 1)
            simpleMaze(p + "R",row,col-1);
    }

    public static void diagonalMaze(String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
        }

        if (row > 1)
            diagonalMaze(p + "Down",row-1,col);
        if (col > 1)
            diagonalMaze(p + "Right",row,col-1);
        if (row > 1 && col > 1)
            diagonalMaze(p+"Diagonal",row-1,col-1);
    }

    public static void mazeWithObstacles(boolean[][] arr, String p, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(p);
        }

        if (row > 1 && arr[row][col])
            mazeWithObstacles(arr,p + "Down",row-1,col);
        if (col > 1 && arr[row][col])
            mazeWithObstacles(arr,p + "Right",row,col-1);
        if (row > 1 && col > 1 && arr[row][col])
            mazeWithObstacles(arr,p+"Diagonal",row-1,col-1);
    }

    public static void allDirBacktracking(boolean[][] arr, String p, int[][] path, int step, int row, int col){
        // this is the final destination and also the base condition for our recursive function
        if (row == arr.length-1 && col == arr[0].length-1){ // when it either row or col becomes (2,2)
            path[row][col] = step; // this is also an additional step since it is the destination
            for(int[] array : path) {
                System.out.println(Arrays.toString(array)); // printing every row of the path matrix one by one
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // if this node has been visited before in the path don't visit it again just return, don't even bother moving forward
        if(!arr[row][col]){
            System.out.println("Rejecting");
            return;
        }

        arr[row][col] = false; // marking it false means it is being visited
        path[row][col] = step; // recording the current step in the array


        if (row < arr.length -1)
        {
            System.out.println("Going Down");
            allDirBacktracking(arr,p + "Down",path,step+1,row+1,col);

        }
        if (col < arr[0].length - 1)
        {
            System.out.println("Going Right");
            allDirBacktracking(arr,p + "Right",path,step+1,row,col+1);

        }
        if (row > 0)
        {
            System.out.println(row);
            System.out.println("Going Up");
            allDirBacktracking(arr,p+"Up",path,step+1,row-1,col);
        }
        if (col > 0)
        {
            System.out.println(col);
            System.out.println("Going Left");
            allDirBacktracking(arr, p + "Left", path, step + 1, row, col - 1);
        }

        System.out.println("Setting" + " " + row + " " + col + " : " + step);
        arr[row][col] = true;   // marking it true means it is now available, we do this so that the next recursion call
                                // (i.e. when a new path starts, the maze does not act as a restriction) also when it backtracks
                                // this indicates that the particular node has not
        path[row][col] = 0; // resetting path array to 0 so that we can record the new path or continue a partial path and ditch the old path.

    }
}
