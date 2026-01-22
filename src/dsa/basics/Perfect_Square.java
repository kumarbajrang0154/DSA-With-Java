import java.util.*;

public class Perfect_Square {
    public static void perfectSquare(int num) {
        boolean isPerfect = false;

        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect) {
            System.out.println(num + " is a Perfect Square.");
        } else {
            System.out.println(num + " is NOT a Perfect Square.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        perfectSquare(number);
    }
}
