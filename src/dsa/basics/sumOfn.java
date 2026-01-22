import java.util.*;
public class sumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number: ");
        long num = sc.nextLong();
        long result = num*(num+1)/2;

        System.out.println("Total sum of "+num+"th is "+result+".");
        sc.close();
    }
}
