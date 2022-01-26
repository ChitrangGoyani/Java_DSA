package com.chitrang;

public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int middle;
        int peak = -1;
        if(nums.length == 1) // if there's only one element then at 0th position it's the peak
        {
            return 0;
        }
        // when search == end, break
        while(start<end){
            middle = (start+end)/2;
            if(nums[middle+1] > nums[middle]) // if right of middle is bigger, search right
            {
                start = middle + 1;
                peak = middle + 1;
            }
            if(nums[middle+1] < nums[middle]){ // if left of middle is bigger, search left
                end = middle;
                peak = middle;
            }
        }
        return peak;
    }
}
