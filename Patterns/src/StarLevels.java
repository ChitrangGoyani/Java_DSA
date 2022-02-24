import javax.swing.text.html.HTMLDocument;
import java.util.Scanner;

public class StarLevels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels : ");
        int levels = sc.nextInt();
        starMatrix(levels);
        System.out.println();
        ascendingprintStars(levels);
        System.out.println();
        descendingprintStars(levels);
        System.out.println();
        rightArrow(levels);
        System.out.println();
        oppositeAscending(levels);
        System.out.println();
        oppositeDescending(levels);
        System.out.println();
        oddPyramid(levels);
    }

    static void descendingprintStars(int levels){
        System.out.println("Pattern Question 3");
        for(int i=1;i<=levels;i++){
            for(int j=i;j<=levels;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ascendingprintStars(int levels){
        System.out.println("Pattern Question 2");
        for(int i=1;i<=levels;i++){
            for(int j=levels-i;j<levels;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void starMatrix(int levels){
        System.out.println("Pattern Question 1");
        for(int i = 1;i<=levels;i++){
            for(int j=1;j<=levels;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightArrow(int levels){
        System.out.println("Pattern Question 5");
        int l = (levels*2) - 1;
        for(int i=1;i<=l;i++){
            if(i <= l/2){
                for(int j=l-i;j<l;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=i;k<=l;k++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void oppositeAscending(int levels){
        System.out.println("Pattern Question 6");
        for(int i=1;i<=levels;i++){
            int spaces = levels-i;
            for(int j=1;j<=levels;j++){
                if(spaces != 0)
                {
                    System.out.print("  ");
                    spaces--;
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void oppositeDescending(int levels){
        System.out.println("Pattern Question 7");
        for(int i=1;i<=levels;i++){
            int spaces = i-1;
            for(int j=1;j<=levels;j++){
                if(spaces != 0)
                {
                    System.out.print("  ");
                    spaces--;
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void oddPyramid(int levels){
        System.out.println("Pattern Question 8");
//        int columns = levels*2 - 1;
        int stars = 1;
        for(int i=1;i<=levels;i++){
            int spaces = levels-i;
            for(int j=1;j<=levels+1;j++){
                if(spaces !=0){
                    System.out.print(" ");
                    spaces--;
                }
                else{
                    if(stars == 1)
                    {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}

