import java.util.*;

public class ReverseArrayInPlace {

    static void reverse(int[] arr) {
        int i = 0;               
        int j = arr.length - 1;    

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;  
            j--; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
 
