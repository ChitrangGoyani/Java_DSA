public class NewtonRhapson {
    /**
     * this method is used to find the sqrt using the formula
     * root = ( X + X/N ) / 2
     * X -> assumed root value
     * The logic here is to assume the N itself as X and dig deeper making the number smaller
     * we introduce a new term error = root - X which takes us closer to the answer
     * Algo :
     * X = N
     * root = ( X + X/N ) / 2
     * while(root - X > 1)
         *  X = root
         *  root = ( X + X/N ) / 2
     * end
     */
}
