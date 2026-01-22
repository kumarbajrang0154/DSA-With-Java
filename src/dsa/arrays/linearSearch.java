import java.util.*;

public class linearSearch {

    static void search(int[] arr, int num) {
        int len = arr.length;
        boolean status = false;  
        int index = -1;          

        for(int i = 0; i < len; i++) {
            if (arr[i] == num) {
                index = i;       
                status = true;    
                break;           
            }
        }

        
        if (status) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] arr = {3, 5, 1, 8, 2, 4, 0};
        search(arr, num);

        sc.close();
    }
}
