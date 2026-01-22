import java.util.*;

public class Automorphic_Number {

    public static void AutomorphicCheck(int num) {
        int square = num * num;
        int temp = num;

        boolean isAutomorphic = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is not an Automorphic Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        AutomorphicCheck(num);
        sc.close();
    }
}
