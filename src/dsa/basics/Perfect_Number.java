import java.util.*;
public class Perfect_Number {
    //Create a function to check whether the given number is perfect or not.......
    public static void perfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            // Check the numbers which are divisible for num...
            if(num % i == 0){
                sum = sum + i;
            }
        }
        // Check the sum is equal to num or not.......
        if(sum == num){
            System.out.print(num + " is Perfect number.");
        }else{
            System.out.print(num + " is not Perfect number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        perfectNumber(num); // Call the function to check.......
        sc.close();
    }
}
