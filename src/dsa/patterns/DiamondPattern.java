import java.util.*;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int rows = sc.nextInt();
        printDiamond(rows);
        sc.close();
    }
    static void printDiamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
