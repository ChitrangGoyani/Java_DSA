public class SetithBit {

    public static void main(String[] args) {
        // 1 1 0 1 1 -> 1 + 2 + 8 + 16 = 27
        // I want to set the bit at position 3 from right side so ith bit is 3 (0 -> 1 , 1 -> 1)
        //                     1 1 0 1 1
        //                OR   0 0 1 0 0  mask
        // =                   1 1 1 1 1 -> 3rd bit is set, number is 27 + 4 = 31
        int x = 27;
        int i = 3;
        // how to make the mask ? left shift 1 by 2 (i-1) positions
        System.out.println(Integer.toBinaryString(1 << i-1));
        // x | (1 << i-1)
        System.out.println(x | (1 << i-1));
    }

}
