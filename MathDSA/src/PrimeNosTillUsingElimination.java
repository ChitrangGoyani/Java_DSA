import java.util.Arrays;
import java.util.Enumeration;

public class PrimeNosTillUsingElimination {
    public static void main(String[] args) {
        //find all prime nos till n
        // TC : O(N*log(logN))
        boolean[] result = isPrime(40);
        for(int i = 2; i<=40; i++){
            if(!result[i]){
                System.out.println(i + "");
            }
        }
    }

    static boolean[] isPrime(int number){
        /**
         * We need a boolean array of size n - marked as false assuming that all are prime initially
         * so the trick here is to start from 2 and go on till <= sqrt of the number we know 2 is a prime right so we
         * eliminate all multiples of two, then we know 3 is prime se we eliminate all multiples of 3 and so on..
         * at the end when we are at sqrt all those elements of the array that are marked false are prime
         */
        if(number <= 1){
            return new boolean[] {false};
        }
        boolean[] boolArray = new boolean[number+1];
        for(int i = 2; i*i<=number ; i++){
            if(!boolArray[i]){
                for(int j = 2; j*i<=number; j++){
                    boolArray[j*i] = true;
                }
            }
        }
        return boolArray;
    }
}
