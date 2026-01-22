import java.util.*;
public class countDigit {

    static void counter(int num){
        int temp =num;
        int count = 0;

        while(temp != 0){
            count++;
            temp = temp/10;
        }

        System.out.println("Total counts of "+num+" digits is "+count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = sc.nextInt();
        counter(num);
    }
}
