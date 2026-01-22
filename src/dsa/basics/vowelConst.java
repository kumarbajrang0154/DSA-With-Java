import java.util.Scanner;

public class vowelConst {

    static void vowelOrNot(char ch) {
        
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Consonant letter.");
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 
        vowelOrNot(ch);
        sc.close();
    }
}
