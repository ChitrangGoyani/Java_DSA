import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,7,1,2,9,4};
        System.out.println(Arrays.toString(bubbleSort(nums,0,0)));
    }

    static int[] bubbleSort(int[] nums,int i,int j){
        //base condition
        if(i == nums.length){
            return nums;
        }
        if(j < nums.length - 1){
            if(nums[j] > nums[j+1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            return bubbleSort(nums,i,j+1);
        }
        return bubbleSort(nums,i+1,0);
    }
}
