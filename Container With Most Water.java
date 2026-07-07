class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length - 1;
        int maxarea = 0;
        while (start < end) {
            int carea = Math.min(height[start], height[end]) * (end - start);
            maxarea = Math.max(maxarea, carea);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxarea;
    }
}
