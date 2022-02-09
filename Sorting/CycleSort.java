import java.util.Arrays;

public class CycleSort {
    // only for 1 -> n, sort in one pass, worst case O(n)
    // logic is that each element is supposed to be placed at index = element - 1
    //because if sorted (1,2,3,4,5) -> indexes (0,1,2,3,4) hence every element is mapped to element - 1 index
    public static void main(String[] args) {
        int[] nums = {3,2,4,5,1};
        System.out.println(Arrays.toString(cycleSort(nums)));
    }

    static int[] cycleSort(int[] nums){
        int counter = nums.length - 1;
        while(counter!=0){
            // only 0th index will be swapped with to every other index
            int i =0;
            if(nums[nums[i] - 1] != nums[i]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
            counter--;
        }
        return nums;
    }

}
