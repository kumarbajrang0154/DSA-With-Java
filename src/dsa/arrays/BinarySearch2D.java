public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {51, 53, 55, 60}
        };
        int target = 60;
        int[] result = searchMatrix(matrix, target);
        if (result[0] != -1) {
            System.out.println("Element found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }

    static int[] searchMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
