package com.chitrang;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
// to solve this, basically do BS on both sides instead of just left or right
// so if your target matches middle element, dont stop, search left side also (1)
// and then retrigger binary search and search right part (2)

import java.util.Arrays;

public class FirstandLastPositionofElement {
    public static void main(String[] args) {

        int[] nums = {5,7,7,7,7,8,8,9};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        int firstPosition = BS(nums,target, true);
        int lastPosition = BS(nums,target,false);
        ans[0] = firstPosition;
        ans[1] = lastPosition;
        return ans;
    }


    static int BS(int[] arr,int target, boolean findStart){
        int res = -1;
        int s = 0, e = arr.length - 1,m;
        while(s<=e){
            m = (s+e)/2;
            if(target < arr[m]) e = m - 1;
            else if(target > arr[m]) s = m + 1;
            else {
                res = m;
                if(findStart){ // (1) searching left
                    e = m - 1;
                } else{
                    s = m + 1; // (2) searching right
                }
            };
        }
        return res;
    }
}
