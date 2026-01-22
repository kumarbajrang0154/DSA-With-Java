// LeetCode 69 - Sqrt(X)

import java.util.*;
public class LeetCode_69_SqrtX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its square root: ");
        int x = sc.nextInt();
        int result = mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
        sc.close();
    }

    static int mySqrt(int x){
        if (x == 0) return 0;
        int left = 1, right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid; // mid is a potential answer
                left = mid + 1; // try for a larger mid
            } else {
                right = mid - 1; // try for a smaller mid
            }
        }
        return ans;
    }
}
