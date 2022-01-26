package com.chitrang;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,2,1,0};
        System.out.println(peakIndexinMountain(arr));
    }

    static int peakIndexinMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int peak = -1;
        int middle;
        while(start<end){
            middle = (start+end)/2;
            if(arr[middle+1] > arr[middle]){ // if the one after me is bigger, idc about left
                start = middle + 1;
                peak = middle + 1;
            }
            else if(arr[middle-1] > arr[middle]){ // if the one before me is bigger, idc about right
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
