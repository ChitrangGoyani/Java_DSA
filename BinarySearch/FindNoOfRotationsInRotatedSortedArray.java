package com.chitrang;

public class FindNoOfRotationsInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        System.out.println(findRotationCount(nums));
    }

    static int findRotationCount(int nums[]){
        int rotCount = 0;
        int pivot = -1;
        int s = 0, e = nums.length - 1, m;
        while (s<=e){
            m = s + (e - s)/2;
            if(m < e && nums[m] > nums[m+1]){
                pivot = m;
                rotCount = pivot + 1;
                break;
            }
            if(m > s && nums[m] < nums[m-1]){
                pivot = m-1;
                rotCount = pivot + 1;
                break;
            }
            if(nums[m] > nums[s]){
                s = m+1;
            }
            if(nums[m] <= nums[s]){
                e = m - 1;
            }
        }
        return rotCount;
    }

}
