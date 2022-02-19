import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(nums));
    }

    static List<Integer> findAllDuplicates(int[] nums){
        List<Integer> allDup = new ArrayList<Integer>();
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
                allDup.add(nums[j]);
            }
        }
        return allDup;
    }

}
