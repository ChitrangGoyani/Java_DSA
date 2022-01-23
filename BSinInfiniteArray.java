package com.chitrang;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class BSinInfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3,5,7,9,90,100,130,140,160,170};
        System.out.println(BSInfinite(arr, 3));

    }

    static int BSInfinite(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){ // dont wanna start BS until your target is > end (because obviously sorted array)
            int newStart = end + 1;
            end = end + (end - (start - 1))*2; // previous end + sizeofcurrentBox*2 // exponential increase of box (chunk)
            start = newStart;
        }
        return BS(arr,target,start,end);
    }

    static int BS(int[] arr, int target, int start, int end){
        int middle, result = -1;
        while(start<=end){
            middle = (start+end)/2;
            if(target < arr[middle]) end = middle - 1;
            else if(target > arr[middle]) start = middle + 1;
            else {result = middle; break;}
        }
        return result;
    }

}
