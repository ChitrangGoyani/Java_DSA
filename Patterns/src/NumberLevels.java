import java.util.Scanner;

public class NumberLevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels : ");
        int levels = sc.nextInt();
        ascendingnumberLevels(levels);
    }

    static void ascendingnumberLevels(int levels){
        System.out.println("Pattern Question 4");
        int no;
        for(int i=1;i<=levels;i++){
            no = 1;
            for(int j=levels-i;j<levels;j++){
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
    }
}
