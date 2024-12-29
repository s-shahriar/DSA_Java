package Array;

public class TrappingRainwater {

    public static int trappedRainwater(int[] height) {
        int length = height.length;           // Length of the array
        int trappedWater = 0;                 // Total trapped water

        int leftMax[] = new int[length];      // Stores the maximum height to the left of each index
        int rightMax[] = new int[length];     // Stores the maximum height to the right of each index

        // LeftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < length; i++) {    // Compute the highest bar to the left for each index
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // RightMax array
        rightMax[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {  // Compute the highest bar to the right for each index
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trappedWater
        for (int i = 0; i < length; i++) {   // Compute water trapped above each index
            int waterLevel = Math.min(rightMax[i], leftMax[i]); // Water level = min(leftMax, rightMax)
            trappedWater += waterLevel - height[i];            // Add trapped water at this index
        }

        return trappedWater;                 // Return total trapped water
    };

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int ans = trappedRainwater(height);
        System.out.println("Trapped Rainwater = " + ans);
    }
}

        /*
         +----------------------------------------+
         |               START                    |
         +----------------------------------------+
                          |
                          v
         +-----------------------------------------------+
         |  INPUT: height[] array (e.g., {0,1,0,2,...})  |
         +-----------------------------------------------+
                          |
                          v
         +-----------------------------------------------+
         |  1. Create leftMax[]:                         |
         |     - Traverse left to right.                 |
         |     - For each index, store the maximum       |
         |       height bar seen so far on the left.     |
         +-----------------------------------------------+
                          |
                          v
         +-----------------------------------------------+
         |  2. Create rightMax[]:                        |
         |     - Traverse right to left.                 |
         |     - For each index, store the maximum       |
         |       height bar seen so far on the right.    |
         +-----------------------------------------------+
                          |
                          v
         +-----------------------------------------------+
         |  3. Compute trapped water:                    |
         |     - For each index:                         |
         |       a) Find the water level as              |
         |          min(leftMax[i], rightMax[i]).        |
         |       b) Subtract height[i] from water level  |
         |          to find water trapped at that index. |
         |       c) Add trapped water to total.          |
         +-----------------------------------------------+
                          |
                          v
         +-----------------------------------------------+
         |  OUTPUT: Trapped rainwater (e.g., 6).         |
         +-----------------------------------------------+
                          |
                          v
         +----------------+
         |     END        |
         +----------------+
        */
