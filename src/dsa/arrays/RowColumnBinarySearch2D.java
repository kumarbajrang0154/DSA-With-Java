public class RowColumnBinarySearch2D {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {51, 53, 55, 60}
        };

        int target = 60;
        int[] result = searchMatrix(matrix, target);

        if(result[0] != -1){
            System.out.println("Element found at position: (" 
                + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }

    static int[] searchMatrix(int[][] matrix, int target){

        if(!isSorted(matrix)){
            return new int[]{-1, -1};
        }

        for(int i = 0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;

            while(start <= end){
                int mid = start + (end - start) / 2;

                if(matrix[i][mid] == target){
                    return new int[]{i, mid};
                } 
                else if(matrix[i][mid] < target){
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    static boolean isSorted(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] < matrix[i][j - 1]){
                    return false;  
                }
            }
        }
        return true;  
    }
}
