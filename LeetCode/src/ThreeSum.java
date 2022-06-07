import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum = new ArrayList<>();
        /**
         Constraints :
         1. sum == 0 (of nums at i,j,k)
         2. i!=j, j!=k, k!=i

                [-3,-1,0,1,2,3,4]
         sort   [-3,-1,0,1,2,3,4]
                 i  L          R

         for [0,0,0,0]
                i L R
          -> i will continue to 1
          -> currSum == 0 and threeSum = [0,0,0]
          -> after L++, R--, L > R hence the two while loops aren't triggered


         */
        int n = nums.length;
        if(n < 3) return threeSum;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue; // this is to avoid duplicate triplets
            int L = i+1, R = n - 1;
            while(L < R){
                int currentSum = nums[i] + nums[L] + nums[R];
                if(currentSum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    threeSum.add(list);
                    L++;
                    R--;

                    while(L < R && nums[L] == nums[L-1]) L++; // avoid duplicate triplets, tackles conditions like [0,0,0,0]
                    while(L < R && nums[R] == nums[R+1]) R--; // same as above
                }
                else if(currentSum < 0){
                    L++;
                }else R--;
            }
        }
        return threeSum;
    }
}
