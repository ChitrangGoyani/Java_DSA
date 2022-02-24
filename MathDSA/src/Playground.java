public class Playground {

    public static void main(String[] args) {
        System.out.println(10 >> 1); //right shift by one == 5
        System.out.println(Integer.toBinaryString(10)); //convert to binary
        System.out.println(Integer.toBinaryString(10 << 1)); //left shift by one == 20
        // a << 1 = 2a
        // a << b = a * 2^b (power)
        System.out.println(Integer.toBinaryString(10 >> 1)); //right shift by one == 5
        // a >> 1 = a / 2
        // a >> b = a / 2^b

    }

}
