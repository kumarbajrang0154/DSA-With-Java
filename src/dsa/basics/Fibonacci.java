
import java.util.Scanner;

// public class Fibonacci {
//     public static void fibonacciSeries(int count, int a, int b){
//         if(count == 0){
//             return;
//         }
//         int c = a + b;
//         a = b;
//         b = c;
//         System.out.print(" " + c);
//         fibonacciSeries(count-1, a, b);

        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count = sc.nextInt();
//         int a = 0; 
//         int b = 1;
        
//         if(count <= 0){
//             System.out.println("0");
//         }else if(count == 2){
//             System.out.print(a + b);
//         }else{
//             System.out.print("0 1");
//             fibonacciSeries(count, a, b);
//         }
//     }
// }


// With using foor loop and function method....
public class Fibonacci{
    public static void fibonacciSeries(int count){
        int a = 0;
        int b = 1;
        if (count <= 0 ){
            System.out.println(a);
        }else if(count == 2){
            System.out.println(a+b);
        }else{
            int c = 0 ;
            for(int i = 0; i <= count; i++){
                c = a + b;
                a = b; 
                b = c;
            }
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        fibonacciSeries(count);
    }
}
