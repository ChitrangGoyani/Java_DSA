package com.chitrang;
// SS -> Strictly Sorted
public class TwodBinarySearchSS {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 12;
        twoDBSSS(arr,target);
    }

    static void twoDBSSS(int[][] arr, int target) {
        int rows = arr.length - 1;
        int start = 0;
        int end = arr.length - 1;
        int targetCompare;
        int middleRow = rows / 2;
        int middleofMiddleArray;
        while(start <= end){
            // this array is to transfer contents of middle row to bsarray to send to binarysearch function
            middleofMiddleArray = (arr[middleRow].length-1)/2;
            targetCompare = arr[middleRow][middleofMiddleArray];
            if (target == targetCompare) {
                System.out.println("Element found at : " + middleRow + "," + middleofMiddleArray);
                break;
            }
            else {
                int index = BS(arr[middleRow],target);
                if(index != -1)
                {   System.out.println("Element found at : " + middleRow + "," + index);
                    break;
                }
            }
            if (target > targetCompare){
                start = middleRow + 1;
                middleRow = (start+end)/2;
            }
            if(target < targetCompare){
                end = middleRow - 1;
                middleRow = (start+end)/2;
            }
            if(start > end) System.out.println("Not found!");
        }
    }

    static int BS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int middle;
        while(start <= end){
            middle = (start+end)/2;
            if (arr[middle] == target) return middle;
            else if (target < arr[middle]){
                //search in left
                end = middle - 1;
            }
            else if (target > arr[middle]){
                //search in right
                start = middle + 1;
            }
        }
        return -1;
    }
}
