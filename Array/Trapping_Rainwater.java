package Array;

public class Trapping_Rainwater {
    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 6, 3, 2, 5 };
        Calculate_Trapping_Rainwater CTR = new Calculate_Trapping_Rainwater();
        int area_of_water = CTR.find_trapping_water(heights);
        System.out.println(area_of_water);
    }
}

class Calculate_Trapping_Rainwater {
    public int find_trapping_water(int[] heights) {
        // Base case - 1
        if (heights.length < 3) {
            return 0;
        }

        int[] LMH = Left_max_height(heights);
        int[] RMH = Right_max_height(heights);
        int maxAreaOfWater = 0;

        for (int i = 0; i < heights.length; i++) {
            int curH = heights[i];
            int minOfLeftOrRight = Math.min(LMH[i], RMH[i]);
            int result = (minOfLeftOrRight - curH);
            if (result > 0) {
                maxAreaOfWater += result;
            }
        }

        return maxAreaOfWater;
    }

    // For Left max element :-->>
    static int[] Left_max_height(int[] heights) {
        int[] result = new int[heights.length];
        result[0] = 0;
        int leftH = heights[0];

        for (int i = 1; i < heights.length; i++) {

            if (leftH > heights[i]) {
                result[i] = leftH;
            } else {
                result[i] = 0;
                leftH = heights[i];
            }
        }

        return result;
    }

    // For Right max element :-->>
    static int[] Right_max_height(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        result[n - 1] = 0;
        int rightH = heights[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            if (heights[i] < rightH) {
                result[i] = rightH;
            } else {
                result[i] = 0;
                rightH = heights[i];
            }
        }

        return result;
    }
}