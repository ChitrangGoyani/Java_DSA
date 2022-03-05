public class ReverseANumber {
    public static void main(String[] args) {
        reverseNumber(543);
        System.out.println(sum);
        System.out.println(revNo(1234,4));
    }

    static int sum = 0;
    static void reverseNumber(int n){
        //base condition
        if(n == 0)
            return;
        else{
            sum = sum * 10 + n%10;
            reverseNumber(n/10);
        }
    }

    static int revNo(int n, int noOfDigits){
        if(n == 0)
            return n;
        else{
            return n%10*((int)Math.pow(10.0,noOfDigits-1))+revNo(n/10,noOfDigits-1);
            // (last digit)*(its position)
        }
    }
}
