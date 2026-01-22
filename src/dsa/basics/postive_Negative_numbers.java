import java.util.*;

public class postive_Negative_numbers{
    public static void numberCheck(int num){
        if (num > 0) {
            System.out.println("Positive number.");
        }else if (num < 0) {
            System.out.println("Negative number.");
        }else{
            System.out.println("Zero.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        numberCheck(num);
        sc.close();
    }
}