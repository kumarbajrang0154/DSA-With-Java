import java.util.*;

public class Trapped_Rain_Water {
    static int trapedRain(int height[]) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int traped = 0;

        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(height[i], lmax[i - 1]);
        }

        rmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int level = Math.min(lmax[i], rmax[i]);
            traped += (level - height[i]);
        }
        return traped;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        int result = trapedRain(height);
        System.out.println("Total traped water: " + result);
    }
}