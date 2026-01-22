import java.util.*;
public class StrongNumber {
    // Create a function to check is it strong number or not......
    public static void strongNumber(int num){
        int len = String.valueOf(num).length(); // Fetch the length of number......
        int temp = num;
        int sum = 0;
        // Run the loop until reach to length.....
        for (int i = 1; i <= len; i++) {
            int div = temp % 10; // get the last digit of number...
            int result = 1;
            //Find the factorial of a digit.....
            for (int j = div; j > 0; j--) {
                result = result * j;
            }
            sum = sum + result;
            temp = temp / 10; // It remove the last digit from number.......
        } 
        // Compare sum is equal to num or not.....
        if (sum == num) {
            System.out.println(num + " is a Strong Number.");
        }else{
            System.out.println(num + " is not a Strong Number.");
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Strong number: ");
        int num = sc.nextInt();
        strongNumber(num); // Call the function to check......
    }
}
