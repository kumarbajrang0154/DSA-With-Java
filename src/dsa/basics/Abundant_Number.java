import java.util.*;

public class Abundant_Number {
    public static void abundantCheck(int num){
        int temp = num;
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > num) {
            System.out.println(num + " is Abundant Number.");
        }else{
            System.out.println(num + " is not Abundant Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        abundantCheck(num);
        sc.close();
    }
}
