import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playground {
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
//        System.out.println(Arrays.toString(createTargetArray(nums,index)));

//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "leetcode";
//        System.out.println(pangram(sentence));

//        int[][] image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] image = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        int[][] result = flipAndInvertImage(image);
//        for(int[] x : result){
//            for(int value : x){
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

//        int[] nums = {0,1,0,3,12,0};
        int[] nums = {0,0,0,1};
        moveZeroes(nums);

//        int[][] indices = new int[][]{{0,1},{1,1}};
//        System.out.println(oddCells(2,3,indices));
    }

    static int[] createTargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            target[index[i]] = nums[i];
        }
        return target;
    }

    static boolean pangram(String sentence){
        List<Character> chars = new ArrayList<>();
        for(char ola = 'a'; ola <= 'z';ola++){
            chars.add(ola);
        }
        for(int i=0; i<sentence.length();i++){
            for(int j=chars.size()-1; j>=0;j--){
                if(sentence.charAt(i) == chars.get(j))
                    chars.remove(j);
            }
        }
        if(chars.isEmpty())
            return true;
        else
            return false;
    }

    static int[][] flipAndInvertImage(int[][] image){
        // if we start and end ptrs, for every row, we can swap till start > end
        int rows = image.length-1;
        int cols = image.length-1;
        for(int i = 0; i <= rows; i++){
            int start = 0;
            int end = cols;
            while(start <= end){
                int temp = image[i][cols-start];
                image[i][cols-start] = image[i][start];
                image[i][start] = temp;
                start++;
                end--;
            }
        }
        for(int i = 0; i <= rows; i++){
            for(int k = 0; k <= cols; k++){
                //invert
                if(image[i][k] == 0)
                    image[i][k] = 1;
                else
                    image[i][k] = 0;
            }
        }
        return image;
    }

    static int oddCells(int m, int n, int[][] indices){
        /**
         m = 2, n = 3
         [0 0 0]
         [0 0 0]

         indices =
         [0 1]
         [1 1]

         we have (0,0) we have 0
         at (0 1) we have 1
         this means that for row 0 and coln 1
         increment all cells in row 0
         [1 1 1]
         [0 0 0]
         increment all cells in coln 0
         [1 2 1]
         [0 1 0]
         */
        int countOdd = 0;
        int[][] incrementArray= new int[m][n];
        int[] rows = new int [indices.length];
        int[] cols = new int [indices.length];
        //lets collect row and coln increment values
        for(int i=0; i < indices.length; i++){
            rows[i] = indices[i][0];
            cols[i] = indices[i][1];
        }
        int colnUpdate = 0;
        //now iterate over the incrementArray
        for(int rowUpdate = 0; rowUpdate < rows.length; rowUpdate++){
            for(int j=0; j < n; j++)
                incrementArray[rows[rowUpdate]][j]++;
        }
        //update colns
        for(int i=0; i < m; i++){
            colnUpdate = 0;
            while(colnUpdate < cols.length){
                incrementArray[i][cols[colnUpdate]]++;
                colnUpdate++;
            }
        }
        // count odd in incrementArray
        for(int i=0; i < incrementArray.length; i++){
            for(int j=0; j < incrementArray[i].length; j++){
                if(incrementArray[i][j]%2 !=0)
                    countOdd++;
            }
        }
        return countOdd;
    }

    static void moveZeroes(int[] nums) {
        // once you find a 0, move back all elements by one position and add a 0 at end later,
        // start++
        int start = 0;
        int end = nums.length-1;
        for(int i=0;i <= end;i++){
            if(nums[end] != 0)
            {
                if(nums[start] == 0){
                    for(int j=start; j < end;j++){
                        nums[j] = nums[j+1];
                    }
                    end--;
                    nums[end+1] = 0;
                    start++;
//                    if(nums[start] != 0){
//                        start++;
//                    }
                }
            }
//            if(nums[start+1] == 0){
//                start--;
//            }
            else {
                end--;
                i--;
            }
        }
    }

    public int removeDuplicates(int[] nums) {
        /**
         0,0,1,1,2,3,3,3,3
         ^     ^
         counter = 1 -> this guy counts the duplicates

         So basically, when value of elements at L and R are same, increase counter and make ++L = R
         when L and R are diff, reset counter, increment L and then make that L = R
         here, if you wanna convert this to 3 dup allowed just put counter < 2, counter < 1 is for one
         duplicate allowed
         */

        int n = nums.length;
        if (n < 3) return n;
        if (nums[0] == nums[n-1]) return 2;
        int L = 0, R = 1, counter = 0;
        while(R < n){
            if(nums[L] != nums[R]){
                L++;
                nums[L] = nums[R];
                counter = 0;
            }
            else if(nums[L] == nums[R] && counter < 1){
                counter++;
                nums[++L] = nums[R];
                // ++L means increment L first then replace
                // L++ means replace then increment L
            }
            R++;
        }
        return L+1;
    }
}
