package com.chitrang;

// Ceil -> target or next number greater than target [Found when s > e -> start is your ceil because [end target start]]
// Floor -> target or number lesser than target [Found when s > e -> end is your floor because [end target start]]

public class CeilFloor {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,9};
        int target = 6;
        CeilFloorBS(arr,target,1);
    }

    static void CeilFloorBS(int[] arr, int target, int option){ // option = 0 -> ceil, 1-> floor
        int start = 0;
        int end = arr.length - 1;
        int middle;
        while(start <= end){
            middle = (start+end)/2;
            if (arr[middle] == target) {
                System.out.println("Found at : " + middle);
                break;
            }
            if(target < arr[middle]){
                end = middle - 1;
            }
            if(target > arr[middle]){
                start = middle + 1;
            }
            if(start > end){
                if(option == 0 )System.out.println("Found Ceil at : " + start + " i.e " + arr[start]);
                if(option == 1 )System.out.println("Found Floor at : " + end + " i.e " + arr[end]);
            }
        }
    }
}
