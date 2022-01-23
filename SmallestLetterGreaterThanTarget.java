package com.chitrang;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        char[] letters = {'c','f','j','k'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target){
        int start = 0, middle;
        int end = letters.length - 1;
        while(start <= end){
            middle = (start+end)/2;
            if(target >= letters[middle]){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        return letters[start % letters.length];
    }

}
