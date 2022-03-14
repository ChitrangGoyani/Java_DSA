import java.util.Arrays;
// here maybe mr. kushwaha's statement that pivot is at its correct position in the first pass (rec call) is slightly wrong
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {1,5,11,33,56,7,2};
        QuickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void QuickSort(int[] nums, int low, int high){
        //base condition
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = (s + e)/2; // for pivot always take mid element bc that's more efficient O(NlogN)
        int pivot = nums[m];
        while(s <= e){
//            if(nums[s] >= nums[pivot] && nums[e] <= nums[pivot]){
//                if(s == pivot){
//                    pivot = e;
//                    int temp = nums[s];
//                    nums[s] = nums[e];
//                    nums[e] = temp;
//                    s++;
//                }
//                else if (e == pivot){
//                    pivot = s;
//                    int temp = nums[s];
//                    nums[s] = nums[e];
//                    nums[e] = temp;
//                    e--;
//                }
//                else{
//                    int temp = nums[s];
//                    nums[s] = nums[e];
//                    nums[e] = temp;
//                    s++;
//                    e--;
//                }
//            }
//            else if (nums[s] >= nums[pivot] && nums[e] >= nums[pivot])
//                e--;
//            else if (nums[s] <= nums[pivot] && nums[e] <= nums[pivot])
//                s++;
//            else{
//                s++;
//                e--;
//            }

            while (nums[s] < pivot)
                s++;
            while (nums[e] > pivot)
                e--;
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
//        System.out.println(Arrays.toString(nums));
        QuickSort(nums,low,e);
        QuickSort(nums,s,high);
    }
}
