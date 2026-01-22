import java.util.*;

public class SearchElement {

    static boolean searching(int arr[], int num){
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if (arr[i] == num) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int [] arr = {5, 3, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter searching element: ");
        int num = sc.nextInt();

        boolean result = searching(arr, num);

        if (result) {
            System.out.print(num + " is found in the array.");
        } else {
            System.out.print(num + " is not found in the array.");
        }

        sc.close();
    }
}
