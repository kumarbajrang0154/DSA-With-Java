public class MaxSearch2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int max = findMaxIn2DArray(array);
        System.out.println("The maximum element in the 2D array is: " + max);
    }
    static int findMaxIn2DArray(int[][] array){
        int max = Integer.MIN_VALUE;
        for(int i =0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
