package com.chitrang;

public class BinarySearch {

    public static void main(String[] args) {
        //ascending binary search
        // for descending : 1. swap start and end, reverse while loop condition, swap updates on foundleft
        // and foundright, reverse element not found condition
        int []arr = { 2,4,6,8,10,12,14,16,18,20,36,99,200 };
        int toBeSearched = 36;
        binarySearch(arr,toBeSearched);
    }

    static void binarySearch(int arr[], int tBS) {
        int start = 0;// start == 2
        int end = arr.length - 1;// == 200
        int middle = (start+end)/2; // == 6th element
        while (start <= end) {
            if (arr[middle] == tBS) {
                System.out.println("Element found at : " + middle);
                break;
            }
            if (tBS < arr[middle]){ // found in left
                end = middle - 1; // 36 > middle , end = 10th element == 36
            }
            if (tBS > arr[middle]){ // found in right
                start = middle + 1; // 36 > middle , start = 7th element , start = 10th element
            }
            middle = (start+end)/2; // new middle = 7+12/2 = 9th element == 20 , new middle = 10+12/2 = 11th element == 99
            if (start > end) {System.out.println("Element not found!"); break;}
        }

    }
}
