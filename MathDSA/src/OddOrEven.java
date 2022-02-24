public class OddOrEven {
    // logic here is that lsb gives odd or even since in { ... 8 4 2 1 }
    // all powers are multiples of 2 hence if at lsb the bit is set then
    // it is odd or else it is even
    public static void main(String[] args) {
        int x = 10;
        // how to find lsb ?
        // ans : AND (&) with 1
        //  1 0 0 1 0 1  &  0 0 0 0 0 1 = 1
        // (n & 1)
        if ((x & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
