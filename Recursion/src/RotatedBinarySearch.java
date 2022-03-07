public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        System.out.println(RBS(nums,9,0,nums.length-1));
    }

    static int RBS(int[] nums, int target, int s, int e){
        int mid = s + (e - s)/2;
        //base condition
        if(target == nums[mid]){
            return mid;
        }
        if(nums[s] <= nums[mid]){   //if left side of mid is sorted
            if(target >= nums[s] && target < nums[mid]){ // and target lies in first half
                return RBS(nums,target,s,mid-1);
            }
            else{ // key lies in second half
                return RBS(nums,target,mid+1,e);
            }
        }
        else{ // if left side is not sorted
            if(target > nums[mid] && target <= nums[e]){ // but the target lies in the second half
                return RBS(nums,target,mid+1,e);
            }
            else{ // target lies in the unsorted left side
                return RBS(nums,target,s,mid-1);
            }
        }
    }
}
