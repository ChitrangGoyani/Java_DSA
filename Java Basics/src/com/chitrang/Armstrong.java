package com.chitrang;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = in.nextInt();
        System.out.println("Armstrong Number : " + isArmstrong(no));
    }

    static boolean isArmstrong(int num){
        int temp, sum = 0, og = num;
        while (num > 0) {
            temp = num % 10;
            temp = temp * temp * temp;
            sum = sum + temp;
            num = num / 10;
        }
        if(sum == og)
            return true;
        else
            return false;
    }
}
