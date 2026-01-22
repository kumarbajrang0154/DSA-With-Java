import java.util.*;

public class RemoveDuplicate {

    static void duplicateFilter(int arr[]) {
        int len = arr.length;
        Arrays.sort(arr);  
        int[] temp = new int[len];
        int j = 0;  

        for (int i = 0; i < len  ; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }


        for (int i = 0; i < len; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 2, 4, 1, 5};
        duplicateFilter(arr);
    }
}
