import java.util.*;
public class LeftTriangle {

    static void printPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();
        printPattern(row);
        sc.close();
    }
}