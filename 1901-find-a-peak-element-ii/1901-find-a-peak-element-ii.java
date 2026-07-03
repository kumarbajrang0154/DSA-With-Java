class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int maxRow = 0;

            for (int i = 0; i < rows; i++) {

                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < cols) ? mat[maxRow][mid + 1] : -1;
            if (mat[maxRow][mid] > left &&
                mat[maxRow][mid] > right) {

                return new int[]{maxRow, mid};
            }

            else if (right > mat[maxRow][mid]) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}