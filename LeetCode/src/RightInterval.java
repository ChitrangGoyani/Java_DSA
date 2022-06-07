import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    static int[] findRightInterval(int[][] intervals) {
        int[] returnIndices = new int[intervals.length];
        int starti = 0;
        int endi = 0;

        for(int i=0; i < intervals.length; i++){
            starti = intervals[i][0];
            endi = intervals[i][1];
            int returnRightIndex = search(intervals, starti, endi);
            if(returnRightIndex == -1)
                returnIndices[i] = -1;
            else
                returnIndices[i] = returnRightIndex;
        }
        return returnIndices;
    }

    static int search(int[][] intervals, int starti, int endi){
        //since we have to minimize, lets find the first startj that is >= endi
        // lets begin with finding the smallest start
        int smallestStart = 10000000;
        int smallestIndex = intervals.length;
        for (int i = 0; i<intervals.length;i++){
            if(intervals[i][0] >= endi){
                if(intervals[i][0] < smallestStart){
                    smallestStart = intervals[i][0];
                    smallestIndex = i;
                }
            }
        }

        if(smallestIndex == intervals.length)
            return -1;
        else
            return smallestIndex;

    }
}
