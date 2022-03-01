public class FindRightMostSetBit {

    public static void main(String[] args) {
        // lets say we want to find the right most set bit in
        // 0 0 0 0 1 0 1 0  i.e. 10
        // ans is 2
        // soln is to AND it with the negative of the number
        // negative of 10 in binary is found using 2's complement method
        // so we do 1 0 0 0 0 0 0 0 0 - 0 0 0 0 1 0 1 0
        // i.e.       1 1 1 1 1 1 1 1 + 1 - 0 0 0 0 1 0 1 0
        // i.e.       1 1 1 1 1 1 1 1
        //          - 0 0 0 0 1 0 1 0
        //          = 1 1 1 1 0 1 0 1   -> complement
        // add      +               1
        //            1 1 1 1 0 1 1 0   -> -10
        // AND 10     0 0 0 0 1 0 1 0
        //            0 0 0 0 0 0 1 0 -> ANS : 2
        // Formula is (N & -N)
        int x = 10;
        System.out.println(Integer.toBinaryString(-x)); // this is -10
        System.out.println(x & -x); // right most set bit
    }
}
