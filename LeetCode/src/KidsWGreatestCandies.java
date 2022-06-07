import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kwC = new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
        Collections.fill(kwC, Boolean.TRUE); // This is imp. should know
        for(int i=0; i<candies.length;i++){
            int max = candies[i] + extraCandies;
            for(int j=0; j<candies.length;j++){
                if(candies[j] > max)
                {
                    kwC.set(i,false);
                    break;
                }
            }
        }
        return kwC;
    }
}
