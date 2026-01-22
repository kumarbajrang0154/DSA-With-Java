import java.util.*;
public class Harshad_Number {
    public static void harshadCheck(int num){
        int temp = num;
        int digSum = 0;
        while (temp != 0) {
            int div = temp % 10;
            digSum = digSum + div;
            temp = temp / 10;
        }
        if (num % digSum == 0) {
            System.out.println(num + " is Harshad Number.");
        }else{
            System.out.println(num + " is not Harshad Number.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        harshadCheck(num);
        sc.close();
    }
}
