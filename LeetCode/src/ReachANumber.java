// https://leetcode.com/problems/reach-a-number/

public class ReachANumber {

    public static void main(String[] args) {
        System.out.println(reachNumber(5));
    }

    static int reachNumber(int target){
        int sum = 0, jump = 0;
        target = Math.abs(target);
        while(sum < target){ // find the max sum that is >= target
            jump++;
            sum += jump;
        }

        if((sum - target)%2 == 0){ // if diff is even, we can manage to do it in same no of steps
            return jump;
        }
        else if((sum+jump+1-target)%2 == 0){ // if diff is odd and (old diff + n + 1) is even
            return jump+1;
        }
        /**Here if we see, (sum-target) will always be odd, so we just have to check
         * 1. if current steps+1 is odd it means odd+odd will give even, so we can return steps+1
         * 2. if not then odd+even will def give even so return steps+2
         * */
        else
            return jump+2; // (old diff + n + 2) is guaranteed even
    }
}
