import java.util.*;
public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printInvertedPyramid(rows);
        sc.close();
    }
    static void printInvertedPyramid(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
