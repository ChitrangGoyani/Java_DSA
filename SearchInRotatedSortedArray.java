package com.chitrang;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {3,5,1};
        System.out.println(findPivot(nums));
    }

    static int findPivot(int[] nums){
        int pivot = -1;
        int s = 0;
        int e = nums.length - 1;
        int m;
        while(s<=e){
            m = (s+e)/2;
            if(m > s && nums[m] < nums[m-1]){
                pivot = m-1;
                break;
            }
            if(m < e && nums[m] > nums[m+1]){
                pivot = m;
                break;
            }
            if(nums[m] <= nums[s]){
                e = m-1;
            }
            if(nums[m] > nums[s]){
                s = m+1;
            }
        }
        return pivot;
    }
}
