import java.util.*;
public class UniversalBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array in sorted order: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        int result = universalBinarySearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
    static int universalBinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        
        boolean isAscending = array[start] < array[end];
        while(start <= end){
            int mid = (start + end) / 2;
            if (array[mid] == target) {
            return mid;
            }
            if (isAscending) {
                if (array[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (array[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}