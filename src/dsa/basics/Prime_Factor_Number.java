import java.util.*;
public class Prime_Factor_Number {
    //Create a function to check to check prime factor number..........
    public static void primeFactorNumber(int num){

        System.out.print("Prime factors of " + num + " are: ");
        // Run a loop from i = 2 is it divisible or not......
        for (int i = 2; i<= num; i++){
            // Divide the number until it doesn't return false.....
            while (num % i == 0){
                System.out.print(i + " "); // Print if it divisible.....
                num = num / i;
            }
        }
        System.out.println(); // Break the line............
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int num = sc.nextInt();
        primeFactorNumber(num); // Call the function to print.......
        sc.close();
    }
}
