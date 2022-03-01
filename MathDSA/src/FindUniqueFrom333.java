public class FindUniqueFrom333 {
    public static void main(String[] args) {
        /**
         * we need to find the unique element from [2,2,2,7,3,3,3,8,8,8] i.e. 7
         * for unique from 2 we used the XOR method but that doesn't help us here
         * so we count the set bits at each position
         *                                  1 0 -> 2
         *                                  1 0 -> 2
         *                                  1 0 -> 2
         *                                1 1 1 -> 7
         *                                  1 1 -> 3
         *                                  1 1 -> 3
         *                                  1 1 -> 3
         *                              1 0 0 0 -> 8
         *                              1 0 0 0 -> 8
         *                              1 0 0 0 -> 8
         *                          = [ 3 1 7 4 ]
         *      if 7 was not there -> [ 3 0 6 3 ]
         *      so [ 3 1 7 4 ] % 3 -> [0 1 1 1] = 7 <- ANS
         */
    }
}
