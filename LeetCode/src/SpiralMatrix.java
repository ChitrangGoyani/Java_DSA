import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> order = new ArrayList<Integer>();
        int direction = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int steps = (matrix.length* matrix[0].length);
        while(steps > 0){
            if(direction == 0){
                // towards right
                for(int col = left; col <= right; col++){
                    order.add(matrix[top][col]);
                    steps--;
                }
                top++;
            }
            else if (direction == 1){
                // down
                for(int row = top; row <= bottom; row++){
                    order.add(matrix[row][right]);
                    steps--;
                }
                right--;
            }
            else if (direction == 2){
                // towards left
                for (int col = right; col >= left; col--){
                    order.add(matrix[bottom][col]);
                    steps--;
                }
                bottom--;
            }
            else{
                // up
                for (int row = bottom; row >= top; row--){
                    order.add(matrix[row][left]);
                    steps--;
                }
                left++;
            }
            direction = (direction+1)%4;
        }
        return order;
    }
}
