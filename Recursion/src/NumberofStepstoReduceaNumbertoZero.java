//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    static int numberOfSteps(int num){
        //base condition
        if(num == 0)
            return 0;
        if(num % 2 == 0) // checking even or odd just gives us the depth of the recursive function
            return numberOfSteps(num/2)+1; // the +1 here is the counter
        else
            return numberOfSteps(num-1)+1; // the +1 here is the counter
    }
}
