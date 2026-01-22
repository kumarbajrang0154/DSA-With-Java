import java.util.*;
public class RotateArray {

    static void rotateArray(int[] nums, int k){
        int n = nums.length;
        if (n == 0 || k < 0) return;

        // k = k % n; 

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1]; 
            
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last; 
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] nums = {1,2,3,4,5,6,7};
        rotateArray(nums, k);
    }
}
