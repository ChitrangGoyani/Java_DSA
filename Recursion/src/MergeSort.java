import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1,5,11,33,56,7};
        System.out.println(Arrays.toString(mergeSort(nums)));
        System.out.println(Arrays.toString(inanotherWay(nums,0,nums.length-1)));
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

    static int[] inanotherWay(int[] nums, int s, int e){
        int mid = s + (e - s)/2;
        //base condition
        if(s==mid) {
            if(s == mid && e == mid)
                return new int[] {nums[mid]};
            else if(s < e)
                return new int[] {nums[s],nums[e]};
            else
                return new int[] {nums[e],nums[s]};
        }
        int[] left = inanotherWay(nums,s,mid);
        int[] right = inanotherWay(nums,mid+1,e);
        return merge(left,right);
    }

    static void inPlace(int[] nums,int s,int e){
        //base condition
        if(e - s == 1){
            return;
        }
        int m = (s + e)/2;
        inPlace(nums,s,m);
        inPlace(nums,m+1,e);
        inPlaceMerge(nums,s,m,e);
    }

    static void inPlaceMerge(int[] nums, int s,int m,int e){
        int[] mix = new int[e-s+1];
        int i = s;
        int j = m;
    }
}
