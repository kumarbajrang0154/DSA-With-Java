import java.util.*;
public class Missing_Number {

    static void findMissingNumber(int arr[], int n){
        Arrays.sort(arr);
        for(int i = 1; i <= n; i++){
            boolean found = false;
            for(int j = 0; j < n-1; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing number is: " + i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        findMissingNumber(arr, n);
        
    }
}
