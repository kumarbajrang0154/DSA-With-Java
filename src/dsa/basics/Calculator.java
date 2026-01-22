import java.util.*;
public class Calculator {

    public static void calculator(int num1, int num2, String oprtr){
        switch (oprtr) {
            case "+":
                System.out.println("Sum of " + num1 + " and " + num2 + " : " + (num1 + num2));
                break; 
            case "-":
                System.out.println("Substraction of " + num1 + " and " + num2 + " : " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Error: Cannot divide by zero!");
                    break;
                }else if(num1 < num2){
                    System.out.println("Error:" + num1 +" Cannot divide by " + num2);
                }else{
                    System.out.println("Division of " + num1 + " and " + num2 + " : " + (num1 / num2));
                    break;
                }
            default:
                System.out.println("Invalid Operator!");
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the opration (+,/,-,*): ");
        String oprtr = sc.next();
        calculator(num1, num2, oprtr);
        sc.close();
    }
}