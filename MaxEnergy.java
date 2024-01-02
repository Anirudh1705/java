import java.util.*;

public class MaxEnergy{
    public static int maxEnergy(int[] heights) {
        int n = heights.length;
        int maxEnergy = 0;

        for(int i=0; i<n; i++) {
            int energy = 0;
            for(int j=i+1; j<n; j++) {
                if(heights[j] > heights[j-1]) {
                    energy ^= heights[j];
                }
                else {
                    break;
                }
            }
            maxEnergy = Math.max(maxEnergy, energy);
        }
        return maxEnergy;
    }

    public static void main(String[] args) {
        int[] heights = {3, 1, 4, 5, 6};
        System.out.println(maxEnergy(heights));
    }
}
