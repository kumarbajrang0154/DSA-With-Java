class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = col - 1;
        while(low < row && high >= 0){
            if(matrix[low][high] == target){
                return true;
            }else if(matrix[low][high] > target){
                high--;
            }else{
                low++;
            }
        }
        return false;
    }
}