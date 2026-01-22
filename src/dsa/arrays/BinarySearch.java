import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
