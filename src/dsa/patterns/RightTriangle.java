import java .util.*;
public class RightTriangle {

    static void printPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
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
