package com.chitrang;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] mountainArr = {1,5,2};
        System.out.println(findInMountainArray(0,mountainArr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakIndex(mountainArr);
        int middle = peak;
        if(mountainArr[peak] == target){
            return peak;
        }
        int searchLeft = BS(mountainArr, 0, middle-1,target,false);
        if (searchLeft == -1)
        {
            int searchRight = BS(mountainArr, middle+1, mountainArr.length-1, target, true);
            return searchRight;
        }
        else return searchLeft;
    }

    static int BS(int[] mountainArr, int start, int end, int target, boolean isDesc){
        int middle;
        int answer = -1;
        int middleElement;
        while(start<=end){
            middle = (start+end)/2;
            middleElement = mountainArr[middle];
            if(middleElement == target){
                answer = middle;
                break;
            }
            else if(isDesc)
            {
                if (middleElement > target)
                {
                    start = middle + 1;
                }
                if (middleElement < target)
                {
                    end = middle - 1;
                }
            }
            else
            {
                if (middleElement > target)
                {
                    end = middle - 1;
                }
                if(middleElement < target)
                {
                    start = middle + 1;
                }
            }
        }
        return answer;
    }

    static int findPeakIndex(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        int peak = -1;
        int middle;
        while(start<end){
            middle = (start+end)/2;
            if(mountainArr[middle+1]> mountainArr[middle]){ // if the one after me is bigger, idc about left
                start = middle + 1;
                peak = middle + 1;
            }
            else if(mountainArr[middle-1] > mountainArr[middle]){ // if the one before me is bigger, idc about right
                end = middle - 1;
                peak = middle - 1;
            }
            else{
                peak = middle; // if I am the biggest, I'm the king at the peak
                break;
            }
        }
        return peak;
    }
}
