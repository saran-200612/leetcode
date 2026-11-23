class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int c : nums) {
            if (c < min)
                min = c;
        }
        long b = 0;
        for (int c : nums) {
            b += c - min;
        }
        return (int) b;
    }
}
