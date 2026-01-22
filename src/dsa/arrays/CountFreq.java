import java.util.*;

public class CountFreq {

    static void counter(int arr[]) {
        int len = arr.length;

        int max = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1]; 

        for (int i = 0; i < len; i++) {
            freq[arr[i]]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("Count of " + i + " : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        counter(arr);
    }
}
