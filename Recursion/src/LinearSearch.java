import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5,9,55,9,66,11,2,9};
        System.out.println(linearSearchRecursion(nums,9,0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(multipleOccurences(nums,9,0,list));
    }


    static int linearSearchRecursion(int[] nums, int target, int i){
        //base condition
        if(i == nums.length){
            return -1;
        }
        if(target == nums[i]){
            return i;
        }
        else{
            return linearSearchRecursion(nums,target,i+1);
        }
    }


    static ArrayList multipleOccurences(int[] nums, int target, int i,ArrayList<Integer> list){
        //base condition
        if(i == nums.length){
            return list;
        }
        if(target == nums[i]){
            list.add(i);
        }
        return multipleOccurences(nums,target,i+1,list);

    }
}
