package com.chitrang;

import java.util.Arrays;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(largestSum(nums,m));
    }

    static int largestSum(int[] nums,int m){
        int endPoint = 0;//smallest value of m -> 1 , largest possible sum = sum of all elements of the array
        int startPoint = 0; //largest value of m -> no of elements in the array, largest possible sum is largest element
        int len = nums.length;
        int maxElement = nums[0];
        int sumOfElements = maxElement;
        int middle = 0;
        for(int i=1 ; i<len ; i++){
            if(nums[i] > maxElement)
                maxElement = nums[i]; //this is the min largest sum -> startPoint
            sumOfElements = sumOfElements + nums[i]; //this is the max largest sum -> endPoint
        }
        startPoint = maxElement;
        endPoint = sumOfElements;
        //lets begin calculating the largest sum -> Binary Search in range [startPoint,endPoint]
        while(startPoint<endPoint){
            middle = startPoint + (endPoint-startPoint)/2;
            int temp = 0;
            int pieces = 1;
            //calculate the no of pieces
            for(int num : nums) {
                if ((temp + num) <= middle)
                    temp += num;
                else if ((temp + num) > middle) {
                    temp = num;
                    pieces++;
                }
            }
            //checks
            if(pieces <= m)
                endPoint = middle; //because lesser pieces means larger sum, so we need to decrease the sum
            else if(pieces > m)
                startPoint = middle + 1; //because more pieces means smaller sum, so we need to increase the sum
        }
        return endPoint;
    }
}
