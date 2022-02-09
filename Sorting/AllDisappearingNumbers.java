import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDisappearingNumbers {

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println((cycleSort(nums)));

    }

    static List<Integer> cycleSort(int[] nums){
        int n = nums.length;
        List<Integer> missingNumbers = new ArrayList<>();
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
                missingNumbers.add(j+1);
            }
        }
        return missingNumbers;
    }

}
