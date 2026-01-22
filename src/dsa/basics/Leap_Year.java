import java.util.Scanner;

public class Leap_Year {
    public static void leapYear(int year){
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year.");
        }else{
            System.out.println("Not Leap year.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        leapYear(year);
        sc.close();
    }
}
