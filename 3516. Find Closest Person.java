class Solution {
    public int findClosest(int x, int y, int z) {
        int n = Math.abs(x - z);
        int m = Math.abs(y - z);

        int j = 1, k = 2;
        if (n == m) {
            return 0;
        }
        if (n < m)
            return j;
        return k;
    }
}
