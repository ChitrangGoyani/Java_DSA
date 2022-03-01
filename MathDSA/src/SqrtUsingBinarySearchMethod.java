public class SqrtUsingBinarySearchMethod {
    public static void main(String[] args) {
        /**
         * so the way this works is, lets say we have a number 40, and its sqrt is roughly 6.324
         * in BS we find the middle element and then check left or right
         * similarly here we can have an array till 40 and then find the middle
         * and then if m*m < n -> check left else check right
         * you end up at 6 because 6*6 = 36 but 7*7 is 49 so your m = 6
         * now we need to find precision if (m*m != n)
         * so we define precision for number of decimal pts till which we want precision
         * and then add that much precision to 6 until (6*6 <= n)
         * once we get a higher value we subtract the precision and take the last value
         */
        squareRoot(10,3);
    }

    static void squareRoot(int n, int p){
        double root;
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = i+1;
        }
        root = binarySearch(0,n-1,n,nums);
        if(root * root == n){
            System.out.println(root);
            return;
        }
        double multiplier = 0.1;
        while(p > 0){
            root += multiplier;
            while (root * root <= n){
                root += multiplier;
            }
            p -= 1;
            root -= multiplier;
            multiplier /= 10;
        }
        System.out.printf("%.3f",root - multiplier);
    }

    //recursive binarySearch - modified for our problem here
    static int binarySearch(int s, int e, int n, int[] nums){
        //base condition
        if(s > e)
            return s-1;
        int m = s + (e - s)/2;
        //check right
        if(m*m <= n)
            return binarySearch(m+1,e,n,nums);
        else
        //check left
            return binarySearch(s,m-1,n,nums);
    }
}
