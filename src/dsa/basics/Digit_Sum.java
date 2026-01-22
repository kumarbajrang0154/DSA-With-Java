import java.util.Scanner;

public class Digit_Sum {
    public static void sum(long num){
        long temp = num;
        long sum = 0;
        while (temp != 0) {
            long div = temp % 10;
            sum = sum + div;
            temp = temp / 10;
        }
        System.out.println("Total sum: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        long num = sc.nextLong();
        sum(num);
        sc.close();
    }
}
