import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1,5,9,2,11};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    static int[] bubbleSort(int[] nums){
        int length = nums.length;
        boolean swapped;
        for(int i=0;i<length;i++){
            swapped = false;
            for (int j=0;j<length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true; //even if there is one swap, swapped = true but if no swaps that means array is already sorted
                }
            }
            if (!swapped){ // if swapped == false i.e. no swaps occur then break because array is already sorted
                break;
            }
            System.out.println("pass " + i);
        }
        return nums;
    }
}
