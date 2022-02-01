package com.chitrang;
// RS -> Row Sorted, CS -> Column Sorted
public class TwodBinarySearchRSCS {

    public static void main(String[] args) {
        int[][] rscsSortedArray = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 29;
        TwoDBinary(rscsSortedArray,target);
    }

    public static void TwoDBinary(int[][] rscsSortedArray, int target){
        int row = 0,col = rscsSortedArray.length - 1;
        while(row < rscsSortedArray.length && col >=0){
            if (target == rscsSortedArray[row][col]) {
                System.out.println("Found element at : " + row + "," + col);
                break;
            }
            else {
                if (target > rscsSortedArray[row][col]) {
                    // reduce search space -> row--
                    // eliminate current row
                    row++;
                } else {
                    // reduce search space -> col--
                    // eliminate current column
                    col--;
                }
            }
            if (col == -1) System.out.println("Not Found");
        }
    }

}
