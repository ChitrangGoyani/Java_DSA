public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sortedOrNot(nums,0));
    }
    static boolean sortedOrNot(int[] nums,int j){
        //base condition
        if(j == nums.length-1){
            return true;
        }
        if(nums[j] > nums[j+1]){
            return false;
        }
        else{
            return sortedOrNot(nums,j+1);
        }
    }
}
