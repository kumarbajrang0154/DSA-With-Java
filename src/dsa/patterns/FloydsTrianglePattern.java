import java.util.*;
public class FloydsTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printFloydsTriangle(rows);
        sc.close();
    }
    static void printFloydsTriangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}