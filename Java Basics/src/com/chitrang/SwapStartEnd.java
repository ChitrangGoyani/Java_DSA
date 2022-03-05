package com.chitrang;

import java.util.Arrays;
import java.util.Scanner;

public class SwapStartEnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter values of the array");
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        swap(arr);
    }

    static void swap(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for (int i = 0 ; i < arr.length/2; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start +=1;
            end -=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
