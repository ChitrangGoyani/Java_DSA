public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,1,2,1,3,6,4};
        int[] nums2 = {-2,3,2,4,5,-5,-4};
        System.out.println(returnUniqueFromTwoDup(nums1));
        System.out.println(returnUniqueFromNegPos(nums2));
    }

    static int returnUniqueFromTwoDup(int[] nums){
        // logic here is that when (a XOR a) -> 0 and (a XOR 0) -> a
        // so if we do 2^2^3^3 ... ^6(which is unique) -> 6 ^ 0 -> 6
        int unique = 0;
        for(int n : nums){
            System.out.print(unique + " XOR " + n);
            unique ^= n;
            System.out.println(" = " + unique);
        }
        return unique;
    }

    static int returnUniqueFromNegPos(int[] nums){
        int unique = 0;
        System.out.println("Dont think too much, just add them lol.");
        return unique;
    }
}
