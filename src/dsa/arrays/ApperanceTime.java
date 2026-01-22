import java.util.*;
public class ApperanceTime {

    static void findAppearance(int arr[], int x){
        int count = 0;
        for(int num : arr){
            if(num == x){
                count++;
            }
        }
        System.out.print("The element " + x + " appears " + count + " times in the array.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to find its appearance time: ");
        int x = sc.nextInt();
        findAppearance(arr, x);
    }
}
