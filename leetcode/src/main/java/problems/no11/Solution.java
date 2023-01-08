package problems.no11;

class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] == 0) {
                continue;
            }
            int startWidth = maxArea / height[i];
            for (int j = startWidth; j < height.length; j++) {
                int leftHeight = height[i];
                int rightHeight = height[j];
                int width = j - i;
                int currentArea = Math.min(leftHeight, rightHeight) * width;
                if (maxArea < currentArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}