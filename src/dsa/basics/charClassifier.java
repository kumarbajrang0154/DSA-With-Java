import java.util.Scanner;

public class charClassifier {

    
    public static String classifyAscii(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return "Uppercase letter";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Lowercase letter";
        } else {
            return "Not a letter (ASCII)";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character or string: ");
        String input = sc.next();               
        if (input.isEmpty()) {
            System.out.println("No input provided.");
        } else {
            char ch = input.charAt(0);          
            System.out.printf("'%c' -> %s%n", ch, classifyAscii(ch));
        }
        sc.close();
    }
}
