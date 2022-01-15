package com.chitrang;

public class FindEven {
    public static void main(String[] args) {
        int[] arr = {25, 666, 88, 909, 250000};
        System.out.println(findEven(arr));
    }

    static int findEven(int[] nums) {
        int count = 0;
//        int digitCounter = 0;
        //first lets loop over and calculate the no of digits
        for(int i = 0; i < nums.length; i++){
            int currentNo = nums[i];
//            while(currentNo > 0) {
//                digitCounter++;
//                currentNo = currentNo / 10;
//            }
            if(((int)Math.log10(currentNo) + 1 ) % 2 == 0){
                count++;
            }
//            digitCounter = 0;
        }
        return count;
    }
}
