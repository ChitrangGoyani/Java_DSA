public class FindithBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(29)); // has 5 bits {1 1 1 0 1}
        // I want to find the bit at position i == 4 i.e. at index number 1 (position starts from right)
        // Soln : & it with a mask which has only the ith bit as set bit i.e. {0 0 0 1 0}
        // How do you get the mask ? 1 << (i-1)
        // i & (1 << (i-1))
        int n = 29;
        int i = 4; // 4th position from the right
        if ((n & (1 << (i-1))) == 0)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
