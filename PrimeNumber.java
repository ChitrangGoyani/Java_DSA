package com.chitrang;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int no = in.nextInt();
        boolean P  = isPrime(no);
        System.out.println("Prime Number : " + P);
    }

    static boolean isPrime(int num) {
        if(num == 1 || num == 0){
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c += 1;
        }
        return true;
    }
}
