// https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
// https://www.youtube.com/watch?v=MjpAAE3-hYg

import java.util.Arrays;

import static java.lang.Math.*;


/**You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:

 nums.length == n
 nums[i] is a positive integer where 0 <= i < n.
 abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
 The sum of all the elements of nums does not exceed maxSum.
 nums[index] is maximized.
 Return nums[index] of the constructed array.

 Note that abs(x) equals x if x >= 0, and -x otherwise.
 * */


public class MaxValueAtGivenIndexinBA {

    public static void main(String[] args) {
        System.out.println(maxValue(4,2,6));
    }

    static int maxValue(int n, int index, int maxSum){
        int[] nums = new int[n];
        long rightSpaces = n - index - 1;
        long leftSpaces = index;
        long high = maxSum;
        long low = 1;
        long result = 0;
        while(low<=high){
            long middle = (high - low)/2 + low;
            long sum = middle;
            long ls = 0; // sum on left
            long rs = 0; // sum on right
            long m = middle - 1;
            if(sum < maxSum){

            }

        }
        return nums[index];
    }
}
