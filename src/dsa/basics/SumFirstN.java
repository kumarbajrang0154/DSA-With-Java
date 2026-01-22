import java.util.Scanner;

public class SumFirstN {

    public static int sum(int max, int min){
        if (min <= max) {
            return min + sum(max, min + 1);
        } else {
            return 0;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = 1;
        int result = sum(max, min);
        System.out.println("Sum from 1 to " + max + " is: " + result);
    }
}
