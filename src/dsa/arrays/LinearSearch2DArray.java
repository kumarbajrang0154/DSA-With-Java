import java.util.*;
public class LinearSearch2DArray {
    // public static void main(String[] args) {
    //     int[][] array = {
    //         {10, 20, 30},
    //         {40, 50, 60},
    //         {70, 80, 90}
    //     };
    //     int target = 600;
    //     int[] result = linearSearch2D(array, target);
    //     if (result[0] != -1) {
    //         System.out.println("Element found at position: (" + result[0] + ", " + result[1] + ")");
    //     } else {
    //         System.out.println("Element not found in the array.");
    //     }
    // }
    // static int[] linearSearch2D(int[][] array, int target){
    //     for(int i = 0; i < array.length; i++){
    //         for(int j = 0; j < array[i].length; j++){
    //             if(array[i][j] == target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        int result = linearSearch2D(array, target);
        if (result != -1) {
            System.out.println("Element founded in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int linearSearch2D(int[][] array, int target){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == target){
                    return 0;
                }
            }
        }
        return -1;
    }
}