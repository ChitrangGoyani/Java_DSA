import java.util.*;
public class Subsets2 {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(subsetsWithDup(nums));
    }

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, subset, nums);
        return result;
    }

/**take 2 lists, one empty and one filled with nos from the 'nums'
 * once the second list becomes empty, break out of the recursion and along with it pass the first list
 * obvs there will be lhs and rhs, where lhs will be not choosing anything, and rhs will be will be choosing that
 * next obstacle is to avoid duplicates
 */

    static void backtrack(int i, List<List<Integer>> subset, int[] nums){
        // base condition
        if(i == nums.length){
//            ArrayList copy = new ArrayList(subset);
            result.addAll(subset);
            return;
        }

        // All subset that includes element at current index
        List<Integer> list = Arrays.asList(nums[i]);
        subset.add(list);
        backtrack(i+1,subset,nums);
        subset.remove(subset.size()-1);

        // All subset that do not include the element at current index
        while(i+1 < nums.length && nums[i] == nums[i+1])
            i++;
        backtrack(i+1,subset,nums);
    }

}
