import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {13,99,12,11,0,3,4,-2};
        System.out.println(Arrays.toString(insertionSort(nums)));;
    }

    static int[] insertionSort(int[] nums){
        int len = nums.length;
        for(int i =0 ; i<=len-2;i++){ // i runs till len-2 because last element j = i+1, if i runs till len-1 j will be out of bounds
            for(int j=i+1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else
                    break;
            }
        }
        return nums;
    }
}
