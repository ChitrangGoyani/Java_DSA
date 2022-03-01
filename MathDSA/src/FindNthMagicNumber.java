import java.lang.Math;
public class FindNthMagicNumber {
    public static void main(String[] args) {
        // magic number is basically
        // 1 -> 0 0 1 -> 5^3 * 0 + 5^2 * 0 + 5^1 * 1 =  5
        // 2                                            25
        // 3                                            125
        // so just need to run a loop on number of bits of n
        // lets say n = 6 -> 1 1 0
        // 6 & 1 -> last digit i.e. 0 then * with power of 5^i
        // and then to move use 6 >> 1 i.e. shift right by 1
        // so that & will give last digit
        int n = 6;
        int i = 1;
        int magicNumber = 0;
        while(n > 0){
            int lastDigit = (n & 1);
            if (lastDigit > 0) {
                magicNumber += Math.pow(5,i);
            }
            i += 1;
            n = n >> 1;
        }
        System.out.println(magicNumber);
    }
}
