import java.util.*;
public class Square{
    public static void squarePattern(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows and columns: ");
        int num = sc.nextInt();
        squarePattern(num);
        sc.close();
    }
}