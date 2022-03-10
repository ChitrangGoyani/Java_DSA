import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,7,1,2,9,4};
        System.out.println(Arrays.toString(selectionSort(nums,0,0,0)));
    }

    static int[] selectionSort(int[] nums,int max,int i,int j){
        //base condition
        if(i == nums.length){
            return nums;
        }
        if(j < nums.length-i){
            if(nums[max] < nums[j]){
                return selectionSort(nums,j,i,j+1);
            }
            else{
                return selectionSort(nums,max,i,j+1);
            }
        }
        else{
            int temp = nums[nums.length-i-1];
            nums[nums.length-i-1] = nums[max];
            nums[max] = temp;
            return selectionSort(nums,max,i+1,0);
        }
    }
}
