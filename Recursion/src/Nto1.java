public class Nto1 {
    public static void main(String[] args) {
        Nto1(5);
        onetoN(5);
    }

    static void Nto1(int n){
        //base condition
        if (n == 0)
            return;
        else
        {
            System.out.println(n);
            Nto1(n-1);
        }
    }

    static void onetoN(int n){
        //base condition
        if (n == 0)
            return;
        else{
            onetoN(n-1);
            System.out.println(n);
        }
    }
}
