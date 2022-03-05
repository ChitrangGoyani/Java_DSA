public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(5335));
    }

    static int revNo(int n, int noOfDigits){
        //base condition
        if(n == 0)
            return n;
        else{
            return n%10*((int)Math.pow(10.0,noOfDigits-1))+revNo(n/10,noOfDigits-1);
        }
    }

    static boolean isPalindrome(int n){
        if(n == revNo(n,4))
            return true;
        else
            return false;
    }
}
