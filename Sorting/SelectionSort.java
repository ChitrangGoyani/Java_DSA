import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {3,1,14,7,9,0,25,6};
        System.out.println(Arrays.toString(insertionSort(nums)));
//        System.out.println(insertionSort(nums));
    }

    static int[] insertionSort(int[] nums){
        //find the max element and put it in its correct position
        int last = nums.length - 1;
        for(int j = 0;j<=last;j++)
        {
            int maxIndex = 0;
            //find max index
            for (int i = 0; i < nums.length - j - 1; i++) {
                if (nums[i + 1] > nums[maxIndex]) {
                    maxIndex = i+1;
                }
            }
            //swap
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[last - j]; //last - j will run till index of element sorted in previous iteration
            nums[last - j] = temp;
        }
        return nums;
    }

}
