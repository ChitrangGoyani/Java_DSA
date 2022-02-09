public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        int missingNo = -1;
        while(i<nums.length){
            if(nums[i] < n && nums[i] != nums[nums[i]]){
                //swap
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
            else
                i++;
        }
        for(int j=0;j<n;j++){
            if(nums[j] != j){
                missingNo = j;
                break;
            }
            else
                missingNo = n;
        }
        return missingNo;
    }

}
