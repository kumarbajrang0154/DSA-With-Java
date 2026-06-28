class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        for(int col = 0; col < n; col++){
            if(matrix[0][col] == 0){
                firstRowHasZero = true;
                break;
            }
        }
        for(int row = 0; row < m; row++){
            if(matrix[row][0] == 0){
                firstColHasZero = true;
                break;
            }
        }
        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                if(matrix[row][col] == 0){
                    matrix[row][0] = 0; 
                    matrix[0][col] = 0; 
                }
            }
        }
        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                if(matrix[row][0] == 0 || matrix[0][col] == 0){
                    matrix[row][col] = 0;
                }
            }
        }
        if(firstRowHasZero){
            for(int col = 0; col < n; col++){
                matrix[0][col] = 0;
            }
        }
        if(firstColHasZero){
            for(int row = 0; row < m; row++){
                matrix[row][0] = 0;
            }
        }
    }
}