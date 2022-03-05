package com.chitrang;

import java.util.Arrays;
import java.util.Scanner;

public class TwodArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Input matrix");

        // input 2D array
        for (int row = 0; row < arr.length; row ++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

        //output 2d array
//        for(int row = 0; row < 3; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a : arr
             ) {
            System.out.println(Arrays.toString(a));
        }
    }

}
