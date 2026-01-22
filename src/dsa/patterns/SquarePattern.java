import java.util.*;
public class SquarePattern {
    
    static void printPattern(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int col = sc.nextInt();
        printPattern(row, col);
        sc.close();
    }
}
