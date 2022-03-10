import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,5,11,33,56,78,95,4,2,9,16,100};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    static int[] mergeSort(int[] nums){
        //base condition
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(k < merged.length){
            if(j < right.length && i < left.length){
                if(left[i] < right[j]){
                    merged[k] = left[i];
                    k++;
                    i++;
                }
                else{
                    merged[k] = right[j];
                    k++;
                    j++;
                }
            }
            else{
                if(j == right.length && i!= left.length){
                    merged[k] = left[i];
                    i++;
                    k++;
                }
                if(i == left.length && j!= right.length)
                {
                    merged[k] = right[j];
                    j++;
                    k++;
                }
            }
        }
        return merged;
    }
}
