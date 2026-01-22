import java.util.*;
public class MaxConsecutiveOnes {
    static void findMaxConsecutiveOnes(int arr[], int n){
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        System.out.print("Maximum consecutive 1s: " + maxCount);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array (0s and 1s only): ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findMaxConsecutiveOnes(arr, n);
        sc.close();
    }
}
