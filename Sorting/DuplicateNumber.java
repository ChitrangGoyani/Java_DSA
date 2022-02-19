import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums){
        int duplicate =-1;
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] != nums[nums[i] - 1]){
                //swap
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
            else
                i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                duplicate = nums[j];
            }
        }
        return duplicate;
    }
}
