import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String args[]) {
//        subsequences("","abc");
        int [] nums = {1,2,3};
        System.out.println(usingIteration(nums));
        int [] nums2 = {1,2,2,3,4};
        System.out.println(usingIterationWithDuplicates(nums2));
    }

    static void subsequences(String processed,String unprocessed){
        //base condition
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        subsequences(processed,unprocessed.substring(1));
        subsequences(processed+unprocessed.charAt(0),unprocessed.substring(1));
    }

    static List<List<Integer>> usingIteration(int[] nums){ // should return something like [ [],[..],[...]....]
        List<List<Integer>> set = new ArrayList<>(); // make the [ [],[..],[...]....]
        set.add(new ArrayList<>()); // adding the first empty list []
        for(int j = 0;j < nums.length; j++){ // for every number in the array
            int size = set.size(); // take the size of the subset, starts with 1
            for(int i = 0; i<size; i++){ // for every subset list in the set
                List<Integer> subset = new ArrayList<>(set.get(i)); // new subset list is a copy of current subset list, starts with []
                subset.add(nums[j]); // add the new number in the subset
                set.add(subset); // add the subset in the set
            }
        }
        return set;
    }

    static List<List<Integer>> usingIterationWithDuplicates(int[] nums){ // should return something like [ [],[..],[...]....]
        List<List<Integer>> set = new ArrayList<>(); // make the [ [],[..],[...]....]
        set.add(new ArrayList<>()); // adding the first empty list []
        for(int j = 0;j < nums.length; j++){ // for every number in the array
            int size = set.size(); // take the size of the subset, starts with 1
            if(j > 0 && nums[j] == nums[j-1]){
                for(int i = size/2; i<size; i++){ // for every subset list in the set
                    List<Integer> subset = new ArrayList<>(set.get(i)); // new subset list is a copy of current subset list, starts with []
                    subset.add(nums[j]); // add the new number in the subset
                    set.add(subset); // add the subset in the set
                }
            }
            else{
                for(int i = 0; i<size; i++){ // for every subset list in the set
                    List<Integer> subset = new ArrayList<>(set.get(i)); // new subset list is a copy of current subset list, starts with []
                    subset.add(nums[j]); // add the new number in the subset
                    set.add(subset); // add the subset in the set
                }
            }
        }
        return set;
    }
}