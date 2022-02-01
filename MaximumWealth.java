package com.chitrang;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] maxwealth = {
                {1,2,6},
                {3,3,3},
                {3,3,3},
                {6,6,6}
        };
        System.out.println(maximumWealth(maxwealth));
    }

    static int maximumWealth(int[][] accounts){
        int maxval = 0;
        for(int customers = 0; customers < accounts.length; customers++){
            int customertotal = 0;
            for(int banks = 0; banks < accounts[customers].length; banks++){
                customertotal = customertotal + accounts[customers][banks];
            }
            if(customertotal > maxval) maxval = customertotal;
        }
        return maxval;
    }
}
