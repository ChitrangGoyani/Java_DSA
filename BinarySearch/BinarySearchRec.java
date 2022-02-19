package com.chitrang;

public class BinarySearchRec {

    public static void main(String[] args) {
        int[] nums = {5,7,11,19,22};
        System.out.println(binarySearch(nums,22,0,nums.length-1));
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int middle = start + (end - start)/2;
        if(nums[middle] == target){
            return middle;
        }
        if(nums[middle] > target){
            return binarySearch(nums,target,start,middle-1);
        }
        return binarySearch(nums, target, middle+1,end);
    }

}
