import java.util.Scanner;

public class Nto1times {
    public static void Nto1(int min, int max){
        if (max >= min) {
            System.out.println(max);
            max--;
            Nto1(min, max);
        }else{
            return;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = 1;
        Nto1(min, max);
    }
}
