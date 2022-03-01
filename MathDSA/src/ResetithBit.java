public class ResetithBit {
    public static void main(String[] args) {
        // so reset means if the bit is 1 -> 0 and if its 0 -> 0
        // so lets say we have 1 1 0 1 0 (26) and we want to reset 5th bit i.e. make it 0 i.e. 10
        // so we                          1 1 0 1 0
        // AND it with a mask of          0 1 1 1 1
        // to get                         0 1 0 1 0
        // mask is the complement of (1 << (i-1))
        int x = 26;
        int i = 5;
        System.out.println(Integer.toBinaryString(26));
        System.out.println(Integer.toBinaryString((1 << (i-1))));
        System.out.println(findComplement(1 << (i-1)));
        System.out.println(x & findComplement(1 << (i-1)));
    }

    static int findComplement(int c){
        int ognum = c;
        long i = 1;
        while (i<=ognum){
            System.out.println(c);
            c ^= i;
            System.out.println(i);
            System.out.println(c);
            i <<= 1;
            System.out.println(i);
        }
        return c;
    }

}
