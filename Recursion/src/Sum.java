public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfNto1(10));
        System.out.println(sumOfDigits(543));
    }

    static int sumOfNto1(int n){
        //base condition
        if (n == 0)
            return 0;
        else{
            return n+sumOfNto1(n-1);
        }
    }


    static int sumOfDigits(int n){
        //base condition
        if (n == 0)
            return 0;
        else{
            int temp = n % 10;
            return temp+sumOfDigits(n/10);
        }
    }
}
